@file:Suppress("NOTHING_TO_INLINE")

package splitties.views.dsl.drawerlayout

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.annotation.IdRes
import androidx.annotation.StyleRes
import androidx.drawerlayout.widget.DrawerLayout
import splitties.views.dsl.core.*
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

inline fun DrawerLayout.defaultLParams(
    width: Int = matchParent,
    height: Int = matchParent,
    gravity: Int = Gravity.NO_GRAVITY,
    initParams: DrawerLayout.LayoutParams.() -> Unit = {}
): DrawerLayout.LayoutParams = DrawerLayout.LayoutParams(width, height).also {
    it.gravity = gravity
}.apply(initParams)


inline fun DrawerLayout.navigationViewLParams(
    initParams: DrawerLayout.LayoutParams.() -> Unit = { fitsSystemWindows = true }
): DrawerLayout.LayoutParams = defaultLParams(
    width = wrapContent,
    height = matchParent,
    gravity = Gravity.START,
    initParams = initParams
)

inline fun Context.drawerLayout(
    @IdRes id: Int = View.NO_ID,
    @StyleRes theme: Int = NO_THEME,
    initView: DrawerLayout.() -> Unit = {}
): DrawerLayout {
    contract { callsInPlace(initView, InvocationKind.EXACTLY_ONCE) }
    return view(::DrawerLayout, id, theme, initView)
}

inline fun View.drawerLayout(
    @IdRes id: Int = View.NO_ID,
    @StyleRes theme: Int = NO_THEME,
    initView: DrawerLayout.() -> Unit = {}
): DrawerLayout {
    contract { callsInPlace(initView, InvocationKind.EXACTLY_ONCE) }
    return context.drawerLayout(id, theme, initView)
}

inline fun Ui.drawerLayout(
    @IdRes id: Int = View.NO_ID,
    @StyleRes theme: Int = NO_THEME,
    initView: DrawerLayout.() -> Unit = {}
): DrawerLayout {
    contract { callsInPlace(initView, InvocationKind.EXACTLY_ONCE) }
    return ctx.drawerLayout(id, theme, initView)
}
