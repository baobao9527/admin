/*
 * Copyright © 2015-2016, AnHui Mobiao technology co. LTD Inc. All Rights Reserved.
 */

package com.mo008.crdm.models.device;


import com.mo008.crdm.models.device.base.BaseDeviceWarning;

import goja.core.annotation.TableBind;
import com.jfinal.plugin.activerecord.Db;

/**
 * Generated by JFinal.
 */
@TableBind(tableName = "mo_device_warning")
public class DeviceWarning extends BaseDeviceWarning<DeviceWarning> {
    public static final DeviceWarning dao = new DeviceWarning();

    private static final long serialVersionUID = 8531622896216747832L;

    public DeviceWarning findByDeviceAndCategory(Integer deviceId, int category) {
        return findFirst("select * from mo_device_warning where device_id = ? and category = ? ", deviceId, category);
    }


    public boolean deleteByDeviceIdAndCategory(Integer deviceId, int category) {

        return Db.update("delete from mo_device_warning where device_id = ? and category = ?", deviceId, category) >= 0;
    }
}
