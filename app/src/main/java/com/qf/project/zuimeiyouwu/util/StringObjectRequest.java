package com.qf.project.zuimeiyouwu.util;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by Administrator on 2017/1/11.
 */

public class StringObjectRequest extends StringRequest {
    Priority priority;
    public StringObjectRequest(int method, String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }

    public StringObjectRequest(String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(url, listener, errorListener);
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    /*
     * If prioirty set use it,else returned NORMAL
     * @see com.android.volley.Request#getPriority()
     */
    public Priority getPriority() {
        if (this.priority != null) {
            return priority;
        } else {
            return Priority.NORMAL;
        }
    }
}
