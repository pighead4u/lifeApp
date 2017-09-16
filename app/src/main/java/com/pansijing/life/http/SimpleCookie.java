package com.pansijing.life.http;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:24.
 * @desc:
 */

public final class SimpleCookie implements CookieJar {
    private final HashMap<String, Cookie> mCookieStore = new HashMap<>();
    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        for (Cookie cookie : cookies) {
            mCookieStore.put(cookie.name(), cookie);
        }

    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        List<Cookie> cookies = new ArrayList<>();
        for (String key : mCookieStore.keySet()) {
            cookies.add(mCookieStore.get(key));
        }

        return cookies;
    }
}
