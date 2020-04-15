package com.second.olderjpa.contorller;

import com.second.olderjpa.entity.BodyDataEntity;
import com.second.olderjpa.repository.BodyDataRepository;
import com.second.olderjpa.service.BodyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.*;

@RestController
@RequestMapping("/BodyData")
public class BodyDataController {
    @Autowired
    BodyDataRepository bodyDataRepository;
    @Resource
    private BodyDataService bodyDataService;


    /**
     * 分页查询所有body数据
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/findAll/{page}/{size}")
    public Page <BodyDataEntity> findAll(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        PageRequest pageRequest = PageRequest.of(page,size);
//        Page<BodyDataEntity> page = bodyDataRepository.findAll(pageRequest);
//        System.out.println(bodyDataRepository.findAll());
        return bodyDataRepository.findAll(pageRequest);
    }

    /**
     * 查出所有body数据
     * @return
     */
    @GetMapping("/findAll")
    public List <BodyDataEntity> findAll(){
//        System.out.println(bodyDataRepository.findAll());
        return bodyDataRepository.findAll();
    }

    /**
     * 微信上传body数据
     * @param bodyDataEntity
     * @return
     */
    @PostMapping("/saveBodyData")
    public Boolean saveBodyData(@RequestBody BodyDataEntity bodyDataEntity){
        return bodyDataService.save(bodyDataEntity);
    }

    /**
     * 计算某个日期所有评级各自的数量
     * @param date
     * @return
     */
    @GetMapping("/saveBodyData")
    public List<HashMap<String,Integer>> findOlderHealthMap(@RequestParam Date date){
        return  bodyDataService.findAllCount(date);
    }

    /**
     * 计算某个日期所有评级各自的数量
     * @param
     * @return
     */
    @PostMapping("/findAllByClass")
    public List<BodyDataEntity> findAllByClass(@Param("low") String low, @Param("high") String high){
//        low = "0";
//        high = "7";
            System.out.println("收到空值");
        System.out.println(low+"和"+high);
        return  bodyDataService.findAllByTask(low ,high);
    }
}
