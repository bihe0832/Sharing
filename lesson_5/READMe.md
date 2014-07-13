AndroidLog
==========

测试android log中遇到的一些边界值

### TAG
  - TAG 为空，正常打印
  - TAG 长度超过89以后，TAG会被截断，但是会在MSG中打印LOG的完整信息

### MSG

  - MSG 为空，不打印该log
  - MSG 长度超过65535以后，LOG内容会被截断

==========

对于Log的详细描述，可以参考下面的博客：http://blog.csdn.net/thl789/article/details/6629905
