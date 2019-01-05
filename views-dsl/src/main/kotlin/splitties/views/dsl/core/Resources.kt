package splitties.views.dsl.core

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.view.View
import androidx.annotation.AttrRes

@Suppress("NOTHING_TO_INLINE")
inline fun Context.attrDrawable(
        @AttrRes attr: Int
): Drawable {
    val ta = obtainStyledAttributes(intArrayOf(attr))
    val resDrawable = ta.getDrawable(0)!!
    ta.recycle()
    return resDrawable
}

@Suppress("NOTHING_TO_INLINE")
inline fun View.attrDrawable(
        @AttrRes attr: Int
): Drawable = context.attrDrawable(attr)

@Suppress("NOTHING_TO_INLINE")
inline fun Ui.attrDrawable(
        @AttrRes attr: Int
): Drawable = ctx.attrDrawable(attr)


@Suppress("NOTHING_TO_INLINE")
inline fun Context.attrDrawables(
        @AttrRes vararg attrs: Int
): List<Drawable> {
    val ta = obtainStyledAttributes(attrs)
    val resDrawables = List(ta.length()) { ta.getDrawable(it)!! }
    ta.recycle()
    return resDrawables
}

@Suppress("NOTHING_TO_INLINE")
inline fun View.attrDrawables(
        @AttrRes vararg attrs: Int
): List<Drawable> = context.attrDrawables(*attrs)

@Suppress("NOTHING_TO_INLINE")
inline fun Ui.attrDrawables(
        @AttrRes vararg attrs: Int
): List<Drawable> = ctx.attrDrawables(*attrs)


@Suppress("NOTHING_TO_INLINE")
inline fun Context.attrDp(
        @AttrRes attr: Int
): Int {
    val tv = TypedValue()
    return if (theme.resolveAttribute(attr, tv, true)) {
        tv.data
    } else 0
}

@Suppress("NOTHING_TO_INLINE")
inline fun View.attrDp(
        @AttrRes attr: Int
): Int = context.attrDp(attr)

@Suppress("NOTHING_TO_INLINE")
inline fun Ui.attrDp(
        @AttrRes attr: Int
): Int = ctx.attrDp(attr)