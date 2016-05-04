/*
 * 
 */
package com.huimodel.api.base;

import android.content.Context;

import com.lidroid.xutils.BitmapUtils;

// TODO: Auto-generated Javadoc
/**
 * Author: wyouflf
 * Date: 13-11-12
 * Time: 上午10:24.
 *
 * @ClassName: BaseBitmap
 * @Description:
 * @author  作者 E-mail <a href="mailto:yubo@51box.cn">禹波</a>
 * @version 创建时间：2014-1-7 11:11:40
 * Base bitmap.
 */
public class BaseBitmap {
    
    /**
     * Instantiates a new base bitmap.
     */
    private BaseBitmap() {
    	
    }

    /** The bitmap utils. */
    private static BitmapUtils bitmapUtils;

    /**
     * BitmapUtils不是单例的 根据需要重载多个获取实例的方法.
     *
     * @param appContext application context
     * @return the bitmap utils
     */
    public static BitmapUtils getBitmapUtils(Context appContext) {
        if (bitmapUtils == null) {
            bitmapUtils = new BitmapUtils(appContext);
            
            
            
        }
        return bitmapUtils;
    }
}
