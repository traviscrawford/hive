-- Ensure the default behavior displays Enum fields as struct<value:int>
-- and that enum-to-string conversion can be enabled/disabled.

create table convert_enum_to_string
  partitioned by (b string)
  row format serde "org.apache.hadoop.hive.serde2.thrift.ThriftDeserializer"
    with serdeproperties (
      "serialization.class"="org.apache.hadoop.hive.serde2.thrift.test.Complex",
      "serialization.format"="org.apache.thrift.protocol.TBinaryProtocol");

describe convert_enum_to_string;

set hive.data.convert.enum.to.string=true;
describe convert_enum_to_string;

set hive.data.convert.enum.to.string=false;
describe convert_enum_to_string;
