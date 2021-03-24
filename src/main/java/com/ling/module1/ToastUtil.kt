package com.ling.module1

import android.content.Context
import android.widget.Toast


/**
 * Created by ChenLingyun on 2021/3/24.
 */

fun Context.module1Toast(){
    Toast.makeText(this, "来自子模块1的招呼：你好", Toast.LENGTH_SHORT).show()
}