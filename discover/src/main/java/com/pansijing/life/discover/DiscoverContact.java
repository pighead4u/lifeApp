package com.pansijing.life.discover;

import java.util.List;

/**
 * 创建者： zhuhuanhuan
 * 创建时间： 2018/1/26-下午11:45
 * 说明：
 * 修改记录：
 */

public interface DiscoverContact {

    interface View {

        void refreshDataSuccess(List<DiscoverContentBussiness> data);

        void refreshDataFailed();

        void initDataSuccess(List<DiscoverContentBussiness> data);

        void initDataFailed();


    }

    interface Presenter {
        void refreshData();

        void initData();
    }
}
