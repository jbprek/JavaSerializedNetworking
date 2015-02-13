# JavaSerializedNetworking

## What it is

The basic idea is to create a networking platform with flexible protocol semantics, using Java Serializable object as information containers. 
This is a test project meant to be used as proof of concept, baseline for alternative solutions and as building block to other projects as well.


## Protocol desription 

Every message sent and received through the network  is encoded as binary using the following format.


| offset | content| length (bytes) |
 --------|--------|----------------|
| 0 | LEN - Length of message in bytes, unsigned integer, BE | 4 |
| 4 | CRC 32 value for the contents  | 4 |
| 8 | Java serialized object as byte array| LEN - 8  |






 