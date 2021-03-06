package com.second.olderjpa.service;

import com.second.olderjpa.entity.BodyDataEntity;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface BodyDataService {
    Boolean save(BodyDataEntity bodyDataEntity);

    List<HashMap<String ,Integer>> findAllCount(Date date);

    List<BodyDataEntity> findAllByTask(String low,String high);
}
