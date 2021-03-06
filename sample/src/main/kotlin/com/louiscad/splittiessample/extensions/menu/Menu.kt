/*
 * Copyright (c) 2018. Louis Cognault Ayeva Derman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.louiscad.splittiessample.extensions.menu

import android.view.Menu
import android.view.MenuItem
import androidx.annotation.IdRes
import androidx.annotation.StringRes

inline fun Menu.addItem(
    @IdRes id: Int,
    @StringRes titleRes: Int,
    groupId: Int = Menu.NONE,
    order: Int = Menu.NONE,
    block: MenuItem.() -> Unit = {}
) = add(groupId, id, order, titleRes)!!.apply(block)
