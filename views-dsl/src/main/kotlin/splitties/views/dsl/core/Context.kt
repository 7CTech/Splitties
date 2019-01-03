package splitties.views.dsl.core

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.IdRes

@Suppress("NOTHING_TO_INLINE")
inline fun Context.attrDrawable(
        @IdRes attr: Int
): Drawable {
    val ta = obtainStyledAttributes(intArrayOf(attr))
    val resDrawable = ta.getDrawable(0)!!
    ta.recycle()
    return resDrawable
}

@Suppress("NOTHING_TO_INLINE")
inline fun Context.attrDrawables(
        @IdRes vararg attrs: Int
): Array<Drawable> {
    val ta = obtainStyledAttributes(attrs)
    val resDrawables = Array<Drawable>(ta.length()) { ta.getDrawable(it)!! }
    ta.recycle()
    return resDrawables
}