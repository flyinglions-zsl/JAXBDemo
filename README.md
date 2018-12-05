# JAXBDemo
一个利用JAXB，基于注解，实现的 xml与java 数据的自由转换的 demo例子
自定义一个Adapter：
  @XmlJavaTypeAdapter常用在转换比较复杂的对象时，如map类型或者格式化日期等。使用此注解时，需要自己写一个adapter类继承XmlAdapter抽象类，并实现里面的方法。

@XmlJavaTypeAdapter(value=xxx.class),value为自己定义的adapter类
XmlAdapter类如下：
public abstract class XmlAdapter<ValueType,BoundType> {
    // Do-nothing constructor for the derived classes.
    protected XmlAdapter() {}
    // Convert a value type to a bound type.
    public abstract BoundType unmarshal(ValueType v);
    // Convert a bound type to a value type.
    public abstract ValueType marshal(BoundType v);
}
