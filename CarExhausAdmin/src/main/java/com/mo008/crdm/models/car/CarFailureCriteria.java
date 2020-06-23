/*
 * Copyright © 2015-2016, AnHui Mobiao technology co. LTD Inc. All Rights Reserved.
 */

package com.mo008.crdm.models.car;


import com.mo008.crdm.models.car.base.BaseCarFailureCriteria;

import goja.core.annotation.TableBind;

/**
 * Generated by JFinal.
 */
@TableBind(tableName = "mo_car_failure_criteria",pks = "car_id")
public class CarFailureCriteria extends BaseCarFailureCriteria<CarFailureCriteria> {
    public static final CarFailureCriteria dao = new CarFailureCriteria();
    private static final long serialVersionUID = 4044895087524242532L;
}
