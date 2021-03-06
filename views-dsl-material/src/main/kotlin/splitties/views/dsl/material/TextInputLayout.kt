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
package splitties.views.dsl.material

import androidx.annotation.IdRes
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import splitties.views.dsl.core.add
import splitties.views.dsl.core.matchParent
import splitties.views.dsl.core.view
import splitties.views.dsl.core.wrapContent
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import android.widget.LinearLayout.LayoutParams as LP

inline fun TextInputLayout.addInput(
    @IdRes id: Int,
    initView: TextInputEditText.() -> Unit = {}
): TextInputEditText {
    contract { callsInPlace(initView, InvocationKind.EXACTLY_ONCE) }
    return add(
        view(
            createView = ::TextInputEditText,
            id = id,
            initView = initView
        ), LP(matchParent, wrapContent)
    )
}
