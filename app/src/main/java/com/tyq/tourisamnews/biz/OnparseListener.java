package com.tyq.tourisamnews.biz;


import com.tyq.tourisamnews.bean.NewsItem;

import java.util.List;

/**
 * Created by tyq on 2015/11/16.
 */
public interface OnparseListener {
    void onParseSuccess(List<NewsItem> list);
    void onParseFailed();
}
