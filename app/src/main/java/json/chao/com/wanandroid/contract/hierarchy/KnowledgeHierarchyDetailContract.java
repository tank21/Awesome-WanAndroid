package json.chao.com.wanandroid.contract.hierarchy;

import json.chao.com.wanandroid.base.presenter.AbstractPresenter;
import json.chao.com.wanandroid.base.view.BaseView;

/**
 * @author quchao
 * @date 2018/2/23
 */

public interface KnowledgeHierarchyDetailContract  {

    interface View extends BaseView {

        /**
         * Show dismiss detail error view
         */
        void showDismissDetailErrorView();
    }

    interface Presenter extends AbstractPresenter<View> {


    }
}
