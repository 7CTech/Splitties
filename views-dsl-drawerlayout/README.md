# Views DSL DrawerLayout

*DrawerLayout extension of [Views DSL](../views-dsl).*

## Table of contents

* [Functions to instantiate a DrawerLayout](#functions-to-instantiate-a-drawerlayout)
* [`DrawerLayout` extensions](#drawerlayout-extensions)
    * [`defaultLParams`](#defaultlparams)
    * [`navigationViewLParams`](#appbarlparams)

### Functions to instantiate a DrawerLayout

Instead of using `view(::DrawerLayout, …) { … }` or `view<DrawerLayout>(…) { … }`,
you can use `drawerLayout(…) { … }`.

### `DrawerLayout` extensions

#### `defaultLParams`

This extension has default width and height set to `matchParent` and an
optional `gravity` parameter.

#### `navigationViewLParams`

Has a `wrapContent` width, a `matchParent` height, and a gravity of `Gravity.Start`.
Use it when adding an `NavigationView`

## Download

```groovy
implementation "com.louiscad.splitties:splitties-views-dsl-drawerlayout:$splitties_version"
```
