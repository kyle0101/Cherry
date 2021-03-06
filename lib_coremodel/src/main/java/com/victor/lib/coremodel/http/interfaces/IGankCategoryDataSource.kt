package com.victor.lib.coremodel.http.interfaces

import androidx.lifecycle.LiveData
import com.victor.lib.coremodel.data.GankDetailEntity
import com.victor.lib.coremodel.data.GankRes

/*
 * -----------------------------------------------------------------
 * Copyright (C) 2018-2028, by Victor, All rights reserved.
 * -----------------------------------------------------------------
 * File: IGankCategoryDataSource
 * Author: Victor
 * Date: 2020/8/5 上午 11:05
 * Description: 
 * -----------------------------------------------------------------
 */
interface IGankCategoryDataSource {
    fun fetchGankData(): LiveData<GankRes>
    fun fetchGirlData(): LiveData<GankDetailEntity>
}