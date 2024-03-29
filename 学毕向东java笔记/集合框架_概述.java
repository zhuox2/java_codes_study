/*
集合：java.util包。集合存储的都是对象的地址值。


集合框架：
Collection接口，集合超类，共同接口。
	|--List：元素是有序的，元素可以重复。因为该集合体系有索引。特有迭代器ListIterstor
		|--ArrayList：底层使用的链表数据结构。特点：增删速度很快，查询稍慢。线程不同步。
		|--Vector：底层是的数据结构使用的是数组结构。特点：查询速度很快。但是增删稍慢。线程不同步。
		|--LinedList：底层数组数据结构。线程同步。被ArrayList替代了。因为效率低。
	|--Set：元素是无序的，元素不可以重复。
		|--HashSet：底层数据结构是哈希表，是根据哈希值来存储的。线程是非同步的。
		|--TreeSet:可以对Set集合中元素自然排序，存储方式是二叉树。

集合迭代器：
Iteator：是Collection集合接口、Map集合接口共性迭代器。
	|--ListIterator：是List集合中特有迭代器。

集合比较器：
	Comparable接口：是一种默认方式排序的，由 TreeSet 自动调用。
	Comparator接口：是一种扩展性排序。在 Comparable排序不修改情况下，能提供额外的排序方式。提高了程序的扩展性。

---------------------------------------------------------------------------------------------------------------------------

Map接口，集合另一个超类。
	|--Hashtable：底层是哈希表数据结构，不可存入null键或值。该集合是线程同步的。
	|--HashMAP：底层是哈希表数据结构，允许使用null键或值。该集合线程不同步的。
		|--LinkedHashMap
	|--TreeMap：底层是二叉树数据结构。线程不同步。可以用于给map集合中键进行排序。

=============================================================================================================================

工具类：

Collections：对集合进行操作


---------------------------------------------------------------------------------------------------------------------------

详解：
1，Set底层使用的是Map集合。
2，底层为哈希表数据结构，排序去除重复元素只能实现 Comparable 接口，复写hashCode()、equals()、compareTo();
3，底层为二叉树数据结构，排序去除重复元素，可以实现 Comparable 接口中 compareTo()，也可以单独实现 Comparator 接口中 compare()。
*/