/*
1，当子类出现和父类一模一样的函数时，当子类对象调用该函数，会运行子类函数的内容。这种情况是函数的特性：重写(覆盖)
2，子类覆盖父类，必须保证子类权限大于或等于父类权限，才可以覆盖 ，否则编译失败。
3，静态只能覆盖静态。 因为先加载和后加载的问题。
4，重写子父类方法要一模一样，包括返回值类型，否则编译失败。

*/