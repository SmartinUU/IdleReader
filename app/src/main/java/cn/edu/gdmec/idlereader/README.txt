1.滑动顶部导航栏在toolbar中使用imageView显示图片。使用ViewPager让实现页面滑动。




xx.使用gson解析豆瓣电影api，一直出现未知错误Expected BEGIN_ARRAY but was STRING at line 1 column 45.
   这是一个gson的盲区，有的时候服务器给的数据是一个double类型的，使用gson给予的数值类型就使用double，但是有时候其中某项是没有小数点之后的这部分的，
   也就是说在生成Gson数据时，正好用了“1”的这个数据，导致类型错误。这需要我们自己注意，这样我们就该查找是否我们解析的数据下找这个值，修改就ok；