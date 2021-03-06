// Generated by the protocol buffer compiler.  DO NOT EDIT!

package net.freeback.entries;

public final class FBConfigureProto {
  private FBConfigureProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class FBConfigure extends
      com.google.protobuf.GeneratedMessage {
    // Use FBConfigure.newBuilder() to construct.
    private FBConfigure() {}
    
    private static final FBConfigure defaultInstance = new FBConfigure();
    public static FBConfigure getDefaultInstance() {
      return defaultInstance;
    }
    
    public FBConfigure getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.freeback.entries.FBConfigureProto.internal_static_net_freeback_FBConfigure_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.freeback.entries.FBConfigureProto.internal_static_net_freeback_FBConfigure_fieldAccessorTable;
    }
    
    // required int32 VersionCodec = 1;
    public static final int VERSIONCODEC_FIELD_NUMBER = 1;
    private boolean hasVersionCodec;
    private int versionCodec_ = 0;
    public boolean hasVersionCodec() { return hasVersionCodec; }
    public int getVersionCodec() { return versionCodec_; }
    
    // required int32 VersionSystem = 2;
    public static final int VERSIONSYSTEM_FIELD_NUMBER = 2;
    private boolean hasVersionSystem;
    private int versionSystem_ = 0;
    public boolean hasVersionSystem() { return hasVersionSystem; }
    public int getVersionSystem() { return versionSystem_; }
    
    // required int32 ObjectIdLength = 16;
    public static final int OBJECTIDLENGTH_FIELD_NUMBER = 16;
    private boolean hasObjectIdLength;
    private int objectIdLength_ = 0;
    public boolean hasObjectIdLength() { return hasObjectIdLength; }
    public int getObjectIdLength() { return objectIdLength_; }
    
    // required string MongoHost = 5;
    public static final int MONGOHOST_FIELD_NUMBER = 5;
    private boolean hasMongoHost;
    private java.lang.String mongoHost_ = "";
    public boolean hasMongoHost() { return hasMongoHost; }
    public java.lang.String getMongoHost() { return mongoHost_; }
    
    // required int32 MongoPort = 6;
    public static final int MONGOPORT_FIELD_NUMBER = 6;
    private boolean hasMongoPort;
    private int mongoPort_ = 0;
    public boolean hasMongoPort() { return hasMongoPort; }
    public int getMongoPort() { return mongoPort_; }
    
    // required string FreebackDB = 7;
    public static final int FREEBACKDB_FIELD_NUMBER = 7;
    private boolean hasFreebackDB;
    private java.lang.String freebackDB_ = "";
    public boolean hasFreebackDB() { return hasFreebackDB; }
    public java.lang.String getFreebackDB() { return freebackDB_; }
    
    // required string GridFSDB = 8;
    public static final int GRIDFSDB_FIELD_NUMBER = 8;
    private boolean hasGridFSDB;
    private java.lang.String gridFSDB_ = "";
    public boolean hasGridFSDB() { return hasGridFSDB; }
    public java.lang.String getGridFSDB() { return gridFSDB_; }
    
    // required string FileUrlPrefix = 9;
    public static final int FILEURLPREFIX_FIELD_NUMBER = 9;
    private boolean hasFileUrlPrefix;
    private java.lang.String fileUrlPrefix_ = "";
    public boolean hasFileUrlPrefix() { return hasFileUrlPrefix; }
    public java.lang.String getFileUrlPrefix() { return fileUrlPrefix_; }
    
    // required string AuthUser = 17;
    public static final int AUTHUSER_FIELD_NUMBER = 17;
    private boolean hasAuthUser;
    private java.lang.String authUser_ = "";
    public boolean hasAuthUser() { return hasAuthUser; }
    public java.lang.String getAuthUser() { return authUser_; }
    
    // required string AuthPassword = 18;
    public static final int AUTHPASSWORD_FIELD_NUMBER = 18;
    private boolean hasAuthPassword;
    private java.lang.String authPassword_ = "";
    public boolean hasAuthPassword() { return hasAuthPassword; }
    public java.lang.String getAuthPassword() { return authPassword_; }
    
    // required string ServerHost = 10;
    public static final int SERVERHOST_FIELD_NUMBER = 10;
    private boolean hasServerHost;
    private java.lang.String serverHost_ = "";
    public boolean hasServerHost() { return hasServerHost; }
    public java.lang.String getServerHost() { return serverHost_; }
    
    // required int32 ServerPort = 11;
    public static final int SERVERPORT_FIELD_NUMBER = 11;
    private boolean hasServerPort;
    private int serverPort_ = 0;
    public boolean hasServerPort() { return hasServerPort; }
    public int getServerPort() { return serverPort_; }
    
    // required int32 ServerMaxProcessor = 12;
    public static final int SERVERMAXPROCESSOR_FIELD_NUMBER = 12;
    private boolean hasServerMaxProcessor;
    private int serverMaxProcessor_ = 0;
    public boolean hasServerMaxProcessor() { return hasServerMaxProcessor; }
    public int getServerMaxProcessor() { return serverMaxProcessor_; }
    
    // required int32 ServerMaxConnection = 13;
    public static final int SERVERMAXCONNECTION_FIELD_NUMBER = 13;
    private boolean hasServerMaxConnection;
    private int serverMaxConnection_ = 0;
    public boolean hasServerMaxConnection() { return hasServerMaxConnection; }
    public int getServerMaxConnection() { return serverMaxConnection_; }
    
    // required int32 ServerMaxReadBufferSize = 14;
    public static final int SERVERMAXREADBUFFERSIZE_FIELD_NUMBER = 14;
    private boolean hasServerMaxReadBufferSize;
    private int serverMaxReadBufferSize_ = 0;
    public boolean hasServerMaxReadBufferSize() { return hasServerMaxReadBufferSize; }
    public int getServerMaxReadBufferSize() { return serverMaxReadBufferSize_; }
    
    // required int32 ServerMinReadBufferSize = 15;
    public static final int SERVERMINREADBUFFERSIZE_FIELD_NUMBER = 15;
    private boolean hasServerMinReadBufferSize;
    private int serverMinReadBufferSize_ = 0;
    public boolean hasServerMinReadBufferSize() { return hasServerMinReadBufferSize; }
    public int getServerMinReadBufferSize() { return serverMinReadBufferSize_; }
    
    public final boolean isInitialized() {
      if (!hasVersionCodec) return false;
      if (!hasVersionSystem) return false;
      if (!hasObjectIdLength) return false;
      if (!hasMongoHost) return false;
      if (!hasMongoPort) return false;
      if (!hasFreebackDB) return false;
      if (!hasGridFSDB) return false;
      if (!hasFileUrlPrefix) return false;
      if (!hasAuthUser) return false;
      if (!hasAuthPassword) return false;
      if (!hasServerHost) return false;
      if (!hasServerPort) return false;
      if (!hasServerMaxProcessor) return false;
      if (!hasServerMaxConnection) return false;
      if (!hasServerMaxReadBufferSize) return false;
      if (!hasServerMinReadBufferSize) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasVersionCodec()) {
        output.writeInt32(1, getVersionCodec());
      }
      if (hasVersionSystem()) {
        output.writeInt32(2, getVersionSystem());
      }
      if (hasMongoHost()) {
        output.writeString(5, getMongoHost());
      }
      if (hasMongoPort()) {
        output.writeInt32(6, getMongoPort());
      }
      if (hasFreebackDB()) {
        output.writeString(7, getFreebackDB());
      }
      if (hasGridFSDB()) {
        output.writeString(8, getGridFSDB());
      }
      if (hasFileUrlPrefix()) {
        output.writeString(9, getFileUrlPrefix());
      }
      if (hasServerHost()) {
        output.writeString(10, getServerHost());
      }
      if (hasServerPort()) {
        output.writeInt32(11, getServerPort());
      }
      if (hasServerMaxProcessor()) {
        output.writeInt32(12, getServerMaxProcessor());
      }
      if (hasServerMaxConnection()) {
        output.writeInt32(13, getServerMaxConnection());
      }
      if (hasServerMaxReadBufferSize()) {
        output.writeInt32(14, getServerMaxReadBufferSize());
      }
      if (hasServerMinReadBufferSize()) {
        output.writeInt32(15, getServerMinReadBufferSize());
      }
      if (hasObjectIdLength()) {
        output.writeInt32(16, getObjectIdLength());
      }
      if (hasAuthUser()) {
        output.writeString(17, getAuthUser());
      }
      if (hasAuthPassword()) {
        output.writeString(18, getAuthPassword());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasVersionCodec()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getVersionCodec());
      }
      if (hasVersionSystem()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getVersionSystem());
      }
      if (hasMongoHost()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getMongoHost());
      }
      if (hasMongoPort()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, getMongoPort());
      }
      if (hasFreebackDB()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(7, getFreebackDB());
      }
      if (hasGridFSDB()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(8, getGridFSDB());
      }
      if (hasFileUrlPrefix()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(9, getFileUrlPrefix());
      }
      if (hasServerHost()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(10, getServerHost());
      }
      if (hasServerPort()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, getServerPort());
      }
      if (hasServerMaxProcessor()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, getServerMaxProcessor());
      }
      if (hasServerMaxConnection()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, getServerMaxConnection());
      }
      if (hasServerMaxReadBufferSize()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, getServerMaxReadBufferSize());
      }
      if (hasServerMinReadBufferSize()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, getServerMinReadBufferSize());
      }
      if (hasObjectIdLength()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(16, getObjectIdLength());
      }
      if (hasAuthUser()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(17, getAuthUser());
      }
      if (hasAuthPassword()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(18, getAuthPassword());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.freeback.entries.FBConfigureProto.FBConfigure parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.freeback.entries.FBConfigureProto.FBConfigure prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private net.freeback.entries.FBConfigureProto.FBConfigure result;
      
      // Construct using net.freeback.entries.FBConfigureProto.FBConfigure.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new net.freeback.entries.FBConfigureProto.FBConfigure();
        return builder;
      }
      
      protected net.freeback.entries.FBConfigureProto.FBConfigure internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new net.freeback.entries.FBConfigureProto.FBConfigure();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.freeback.entries.FBConfigureProto.FBConfigure.getDescriptor();
      }
      
      public net.freeback.entries.FBConfigureProto.FBConfigure getDefaultInstanceForType() {
        return net.freeback.entries.FBConfigureProto.FBConfigure.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public net.freeback.entries.FBConfigureProto.FBConfigure build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private net.freeback.entries.FBConfigureProto.FBConfigure buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public net.freeback.entries.FBConfigureProto.FBConfigure buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        net.freeback.entries.FBConfigureProto.FBConfigure returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.freeback.entries.FBConfigureProto.FBConfigure) {
          return mergeFrom((net.freeback.entries.FBConfigureProto.FBConfigure)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.freeback.entries.FBConfigureProto.FBConfigure other) {
        if (other == net.freeback.entries.FBConfigureProto.FBConfigure.getDefaultInstance()) return this;
        if (other.hasVersionCodec()) {
          setVersionCodec(other.getVersionCodec());
        }
        if (other.hasVersionSystem()) {
          setVersionSystem(other.getVersionSystem());
        }
        if (other.hasObjectIdLength()) {
          setObjectIdLength(other.getObjectIdLength());
        }
        if (other.hasMongoHost()) {
          setMongoHost(other.getMongoHost());
        }
        if (other.hasMongoPort()) {
          setMongoPort(other.getMongoPort());
        }
        if (other.hasFreebackDB()) {
          setFreebackDB(other.getFreebackDB());
        }
        if (other.hasGridFSDB()) {
          setGridFSDB(other.getGridFSDB());
        }
        if (other.hasFileUrlPrefix()) {
          setFileUrlPrefix(other.getFileUrlPrefix());
        }
        if (other.hasAuthUser()) {
          setAuthUser(other.getAuthUser());
        }
        if (other.hasAuthPassword()) {
          setAuthPassword(other.getAuthPassword());
        }
        if (other.hasServerHost()) {
          setServerHost(other.getServerHost());
        }
        if (other.hasServerPort()) {
          setServerPort(other.getServerPort());
        }
        if (other.hasServerMaxProcessor()) {
          setServerMaxProcessor(other.getServerMaxProcessor());
        }
        if (other.hasServerMaxConnection()) {
          setServerMaxConnection(other.getServerMaxConnection());
        }
        if (other.hasServerMaxReadBufferSize()) {
          setServerMaxReadBufferSize(other.getServerMaxReadBufferSize());
        }
        if (other.hasServerMinReadBufferSize()) {
          setServerMinReadBufferSize(other.getServerMinReadBufferSize());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setVersionCodec(input.readInt32());
              break;
            }
            case 16: {
              setVersionSystem(input.readInt32());
              break;
            }
            case 42: {
              setMongoHost(input.readString());
              break;
            }
            case 48: {
              setMongoPort(input.readInt32());
              break;
            }
            case 58: {
              setFreebackDB(input.readString());
              break;
            }
            case 66: {
              setGridFSDB(input.readString());
              break;
            }
            case 74: {
              setFileUrlPrefix(input.readString());
              break;
            }
            case 82: {
              setServerHost(input.readString());
              break;
            }
            case 88: {
              setServerPort(input.readInt32());
              break;
            }
            case 96: {
              setServerMaxProcessor(input.readInt32());
              break;
            }
            case 104: {
              setServerMaxConnection(input.readInt32());
              break;
            }
            case 112: {
              setServerMaxReadBufferSize(input.readInt32());
              break;
            }
            case 120: {
              setServerMinReadBufferSize(input.readInt32());
              break;
            }
            case 128: {
              setObjectIdLength(input.readInt32());
              break;
            }
            case 138: {
              setAuthUser(input.readString());
              break;
            }
            case 146: {
              setAuthPassword(input.readString());
              break;
            }
          }
        }
      }
      
      
      // required int32 VersionCodec = 1;
      public boolean hasVersionCodec() {
        return result.hasVersionCodec();
      }
      public int getVersionCodec() {
        return result.getVersionCodec();
      }
      public Builder setVersionCodec(int value) {
        result.hasVersionCodec = true;
        result.versionCodec_ = value;
        return this;
      }
      public Builder clearVersionCodec() {
        result.hasVersionCodec = false;
        result.versionCodec_ = 0;
        return this;
      }
      
      // required int32 VersionSystem = 2;
      public boolean hasVersionSystem() {
        return result.hasVersionSystem();
      }
      public int getVersionSystem() {
        return result.getVersionSystem();
      }
      public Builder setVersionSystem(int value) {
        result.hasVersionSystem = true;
        result.versionSystem_ = value;
        return this;
      }
      public Builder clearVersionSystem() {
        result.hasVersionSystem = false;
        result.versionSystem_ = 0;
        return this;
      }
      
      // required int32 ObjectIdLength = 16;
      public boolean hasObjectIdLength() {
        return result.hasObjectIdLength();
      }
      public int getObjectIdLength() {
        return result.getObjectIdLength();
      }
      public Builder setObjectIdLength(int value) {
        result.hasObjectIdLength = true;
        result.objectIdLength_ = value;
        return this;
      }
      public Builder clearObjectIdLength() {
        result.hasObjectIdLength = false;
        result.objectIdLength_ = 0;
        return this;
      }
      
      // required string MongoHost = 5;
      public boolean hasMongoHost() {
        return result.hasMongoHost();
      }
      public java.lang.String getMongoHost() {
        return result.getMongoHost();
      }
      public Builder setMongoHost(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasMongoHost = true;
        result.mongoHost_ = value;
        return this;
      }
      public Builder clearMongoHost() {
        result.hasMongoHost = false;
        result.mongoHost_ = getDefaultInstance().getMongoHost();
        return this;
      }
      
      // required int32 MongoPort = 6;
      public boolean hasMongoPort() {
        return result.hasMongoPort();
      }
      public int getMongoPort() {
        return result.getMongoPort();
      }
      public Builder setMongoPort(int value) {
        result.hasMongoPort = true;
        result.mongoPort_ = value;
        return this;
      }
      public Builder clearMongoPort() {
        result.hasMongoPort = false;
        result.mongoPort_ = 0;
        return this;
      }
      
      // required string FreebackDB = 7;
      public boolean hasFreebackDB() {
        return result.hasFreebackDB();
      }
      public java.lang.String getFreebackDB() {
        return result.getFreebackDB();
      }
      public Builder setFreebackDB(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasFreebackDB = true;
        result.freebackDB_ = value;
        return this;
      }
      public Builder clearFreebackDB() {
        result.hasFreebackDB = false;
        result.freebackDB_ = getDefaultInstance().getFreebackDB();
        return this;
      }
      
      // required string GridFSDB = 8;
      public boolean hasGridFSDB() {
        return result.hasGridFSDB();
      }
      public java.lang.String getGridFSDB() {
        return result.getGridFSDB();
      }
      public Builder setGridFSDB(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasGridFSDB = true;
        result.gridFSDB_ = value;
        return this;
      }
      public Builder clearGridFSDB() {
        result.hasGridFSDB = false;
        result.gridFSDB_ = getDefaultInstance().getGridFSDB();
        return this;
      }
      
      // required string FileUrlPrefix = 9;
      public boolean hasFileUrlPrefix() {
        return result.hasFileUrlPrefix();
      }
      public java.lang.String getFileUrlPrefix() {
        return result.getFileUrlPrefix();
      }
      public Builder setFileUrlPrefix(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasFileUrlPrefix = true;
        result.fileUrlPrefix_ = value;
        return this;
      }
      public Builder clearFileUrlPrefix() {
        result.hasFileUrlPrefix = false;
        result.fileUrlPrefix_ = getDefaultInstance().getFileUrlPrefix();
        return this;
      }
      
      // required string AuthUser = 17;
      public boolean hasAuthUser() {
        return result.hasAuthUser();
      }
      public java.lang.String getAuthUser() {
        return result.getAuthUser();
      }
      public Builder setAuthUser(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAuthUser = true;
        result.authUser_ = value;
        return this;
      }
      public Builder clearAuthUser() {
        result.hasAuthUser = false;
        result.authUser_ = getDefaultInstance().getAuthUser();
        return this;
      }
      
      // required string AuthPassword = 18;
      public boolean hasAuthPassword() {
        return result.hasAuthPassword();
      }
      public java.lang.String getAuthPassword() {
        return result.getAuthPassword();
      }
      public Builder setAuthPassword(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAuthPassword = true;
        result.authPassword_ = value;
        return this;
      }
      public Builder clearAuthPassword() {
        result.hasAuthPassword = false;
        result.authPassword_ = getDefaultInstance().getAuthPassword();
        return this;
      }
      
      // required string ServerHost = 10;
      public boolean hasServerHost() {
        return result.hasServerHost();
      }
      public java.lang.String getServerHost() {
        return result.getServerHost();
      }
      public Builder setServerHost(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasServerHost = true;
        result.serverHost_ = value;
        return this;
      }
      public Builder clearServerHost() {
        result.hasServerHost = false;
        result.serverHost_ = getDefaultInstance().getServerHost();
        return this;
      }
      
      // required int32 ServerPort = 11;
      public boolean hasServerPort() {
        return result.hasServerPort();
      }
      public int getServerPort() {
        return result.getServerPort();
      }
      public Builder setServerPort(int value) {
        result.hasServerPort = true;
        result.serverPort_ = value;
        return this;
      }
      public Builder clearServerPort() {
        result.hasServerPort = false;
        result.serverPort_ = 0;
        return this;
      }
      
      // required int32 ServerMaxProcessor = 12;
      public boolean hasServerMaxProcessor() {
        return result.hasServerMaxProcessor();
      }
      public int getServerMaxProcessor() {
        return result.getServerMaxProcessor();
      }
      public Builder setServerMaxProcessor(int value) {
        result.hasServerMaxProcessor = true;
        result.serverMaxProcessor_ = value;
        return this;
      }
      public Builder clearServerMaxProcessor() {
        result.hasServerMaxProcessor = false;
        result.serverMaxProcessor_ = 0;
        return this;
      }
      
      // required int32 ServerMaxConnection = 13;
      public boolean hasServerMaxConnection() {
        return result.hasServerMaxConnection();
      }
      public int getServerMaxConnection() {
        return result.getServerMaxConnection();
      }
      public Builder setServerMaxConnection(int value) {
        result.hasServerMaxConnection = true;
        result.serverMaxConnection_ = value;
        return this;
      }
      public Builder clearServerMaxConnection() {
        result.hasServerMaxConnection = false;
        result.serverMaxConnection_ = 0;
        return this;
      }
      
      // required int32 ServerMaxReadBufferSize = 14;
      public boolean hasServerMaxReadBufferSize() {
        return result.hasServerMaxReadBufferSize();
      }
      public int getServerMaxReadBufferSize() {
        return result.getServerMaxReadBufferSize();
      }
      public Builder setServerMaxReadBufferSize(int value) {
        result.hasServerMaxReadBufferSize = true;
        result.serverMaxReadBufferSize_ = value;
        return this;
      }
      public Builder clearServerMaxReadBufferSize() {
        result.hasServerMaxReadBufferSize = false;
        result.serverMaxReadBufferSize_ = 0;
        return this;
      }
      
      // required int32 ServerMinReadBufferSize = 15;
      public boolean hasServerMinReadBufferSize() {
        return result.hasServerMinReadBufferSize();
      }
      public int getServerMinReadBufferSize() {
        return result.getServerMinReadBufferSize();
      }
      public Builder setServerMinReadBufferSize(int value) {
        result.hasServerMinReadBufferSize = true;
        result.serverMinReadBufferSize_ = value;
        return this;
      }
      public Builder clearServerMinReadBufferSize() {
        result.hasServerMinReadBufferSize = false;
        result.serverMinReadBufferSize_ = 0;
        return this;
      }
    }
    
    static {
      net.freeback.entries.FBConfigureProto.getDescriptor();
    }
    
    static {
      net.freeback.entries.FBConfigureProto.internalForceInit();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_freeback_FBConfigure_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_freeback_FBConfigure_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FBConfigure.proto\022\014net.freeback\"\200\003\n\013FB" +
      "Configure\022\024\n\014VersionCodec\030\001 \002(\005\022\025\n\rVersi" +
      "onSystem\030\002 \002(\005\022\026\n\016ObjectIdLength\030\020 \002(\005\022\021" +
      "\n\tMongoHost\030\005 \002(\t\022\021\n\tMongoPort\030\006 \002(\005\022\022\n\n" +
      "FreebackDB\030\007 \002(\t\022\020\n\010GridFSDB\030\010 \002(\t\022\025\n\rFi" +
      "leUrlPrefix\030\t \002(\t\022\020\n\010AuthUser\030\021 \002(\t\022\024\n\014A" +
      "uthPassword\030\022 \002(\t\022\022\n\nServerHost\030\n \002(\t\022\022\n" +
      "\nServerPort\030\013 \002(\005\022\032\n\022ServerMaxProcessor\030" +
      "\014 \002(\005\022\033\n\023ServerMaxConnection\030\r \002(\005\022\037\n\027Se" +
      "rverMaxReadBufferSize\030\016 \002(\005\022\037\n\027ServerMin",
      "ReadBufferSize\030\017 \002(\005B(\n\024net.freeback.ent" +
      "riesB\020FBConfigureProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_freeback_FBConfigure_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_freeback_FBConfigure_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_freeback_FBConfigure_descriptor,
              new java.lang.String[] { "VersionCodec", "VersionSystem", "ObjectIdLength", "MongoHost", "MongoPort", "FreebackDB", "GridFSDB", "FileUrlPrefix", "AuthUser", "AuthPassword", "ServerHost", "ServerPort", "ServerMaxProcessor", "ServerMaxConnection", "ServerMaxReadBufferSize", "ServerMinReadBufferSize", },
              net.freeback.entries.FBConfigureProto.FBConfigure.class,
              net.freeback.entries.FBConfigureProto.FBConfigure.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
}
