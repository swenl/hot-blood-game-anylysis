package com.qf.test;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Description：共通的工具类<br/>
 * Copyright (c) ，2019 ， Wenlongshiii <br/>
 * This program is protected by copyright laws. <br/>
 * Date： 2019年12月03日
 *
 * @author 史文龙
 * @version : 1.0
 */
public class CommonUtils {
    public static Config loadApplicationPropertiesFile(){
        return ConfigFactory.load();
    }

    /**
     * sleep
     */

}
