package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivity;
import com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivityModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
* The base model implementation for the LFTincanManifestActivity service. Represents a row in the &quot;Learn_LFTincanManifestActivity&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivityModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFTincanManifestActivityImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFTincanManifestActivityImpl
* @see com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivity
* @see com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivityModel
* @generated
*/
public class LFTincanManifestActivityModelImpl extends BaseModelImpl<LFTincanManifestActivity>
    implements LFTincanManifestActivityModel {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this class directly. All methods that expect a l f tincan manifest activity model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivity} interface instead.
    */
    public static final String TABLE_NAME = "Learn_LFTincanManifestActivity";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "tincanID", Types.VARCHAR },
            { "packageID", Types.BIGINT },
            { "activityType", Types.VARCHAR },
            { "name", Types.VARCHAR },
            { "description", Types.VARCHAR },
            { "launch", Types.VARCHAR },
            { "resource", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFTincanManifestActivity (id_ LONG not null primary key,tincanID VARCHAR(75) null,packageID LONG null,activityType VARCHAR(75) null,name VARCHAR(2000) null,description VARCHAR(2000) null,launch VARCHAR(2000) null,resource VARCHAR(2000) null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFTincanManifestActivity";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivity"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivity"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivity"),
            true);
    public static long PACKAGEID_COLUMN_BITMASK = 1L;
    public static long TINCANID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivity"));
    private static ClassLoader _classLoader = LFTincanManifestActivity.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            LFTincanManifestActivity.class
        };
    private long _id;
    private String _tincanID;
    private String _originalTincanID;
    private Long _packageID;
    private Long _originalPackageID;
    private boolean _setOriginalPackageID;
    private String _activityType;
    private String _name;
    private String _description;
    private String _launch;
    private String _resource;
    private long _columnBitmask;
    private LFTincanManifestActivity _escapedModelProxy;

    public LFTincanManifestActivityModelImpl() {
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return LFTincanManifestActivity.class;
    }

    public String getModelClassName() {
        return LFTincanManifestActivity.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("tincanID", getTincanID());
        attributes.put("packageID", getPackageID());
        attributes.put("activityType", getActivityType());
        attributes.put("name", getName());
        attributes.put("description", getDescription());
        attributes.put("launch", getLaunch());
        attributes.put("resource", getResource());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String tincanID = (String) attributes.get("tincanID");

        if (tincanID != null) {
            setTincanID(tincanID);
        }

        Long packageID = (Long) attributes.get("packageID");

        if (packageID != null) {
            setPackageID(packageID);
        }

        String activityType = (String) attributes.get("activityType");

        if (activityType != null) {
            setActivityType(activityType);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String launch = (String) attributes.get("launch");

        if (launch != null) {
            setLaunch(launch);
        }

        String resource = (String) attributes.get("resource");

        if (resource != null) {
            setResource(resource);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getTincanID() {
        return _tincanID;
    }

    public void setTincanID(String tincanID) {
        _columnBitmask |= TINCANID_COLUMN_BITMASK;

        if (_originalTincanID == null) {
            _originalTincanID = _tincanID;
        }

        _tincanID = tincanID;
    }

    public String getOriginalTincanID() {
        return _originalTincanID;
    }

    public Long getPackageID() {
        return _packageID;
    }

    public void setPackageID(Long packageID) {
        _columnBitmask |= PACKAGEID_COLUMN_BITMASK;

        if (!_setOriginalPackageID) {
            _setOriginalPackageID = true;

            _originalPackageID = _packageID;
        }

        _packageID = packageID;
    }

    public Long getOriginalPackageID() {
        return _originalPackageID;
    }

    public String getActivityType() {
        return _activityType;
    }

    public void setActivityType(String activityType) {
        _activityType = activityType;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getLaunch() {
        return _launch;
    }

    public void setLaunch(String launch) {
        _launch = launch;
    }

    public String getResource() {
        return _resource;
    }

    public void setResource(String resource) {
        _resource = resource;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFTincanManifestActivity.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFTincanManifestActivity toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (LFTincanManifestActivity) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        LFTincanManifestActivityImpl lfTincanManifestActivityImpl = new LFTincanManifestActivityImpl();

        lfTincanManifestActivityImpl.setId(getId());
        lfTincanManifestActivityImpl.setTincanID(getTincanID());
        lfTincanManifestActivityImpl.setPackageID(getPackageID());
        lfTincanManifestActivityImpl.setActivityType(getActivityType());
        lfTincanManifestActivityImpl.setName(getName());
        lfTincanManifestActivityImpl.setDescription(getDescription());
        lfTincanManifestActivityImpl.setLaunch(getLaunch());
        lfTincanManifestActivityImpl.setResource(getResource());

        lfTincanManifestActivityImpl.resetOriginalValues();

        return lfTincanManifestActivityImpl;
    }

    public int compareTo(LFTincanManifestActivity lfTincanManifestActivity) {
        long primaryKey = lfTincanManifestActivity.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        LFTincanManifestActivity lfTincanManifestActivity = null;

        try {
            lfTincanManifestActivity = (LFTincanManifestActivity) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfTincanManifestActivity.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LFTincanManifestActivityModelImpl lfTincanManifestActivityModelImpl = this;

        lfTincanManifestActivityModelImpl._originalTincanID = lfTincanManifestActivityModelImpl._tincanID;

        lfTincanManifestActivityModelImpl._originalPackageID = lfTincanManifestActivityModelImpl._packageID;

        lfTincanManifestActivityModelImpl._setOriginalPackageID = false;

        lfTincanManifestActivityModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFTincanManifestActivity> toCacheModel() {
        LFTincanManifestActivityCacheModel lfTincanManifestActivityCacheModel = new LFTincanManifestActivityCacheModel();

        lfTincanManifestActivityCacheModel.id = getId();

        lfTincanManifestActivityCacheModel.tincanID = getTincanID();

        String tincanID = lfTincanManifestActivityCacheModel.tincanID;

        if ((tincanID != null) && (tincanID.length() == 0)) {
            lfTincanManifestActivityCacheModel.tincanID = null;
        }

        lfTincanManifestActivityCacheModel.packageID = getPackageID();

        lfTincanManifestActivityCacheModel.activityType = getActivityType();

        String activityType = lfTincanManifestActivityCacheModel.activityType;

        if ((activityType != null) && (activityType.length() == 0)) {
            lfTincanManifestActivityCacheModel.activityType = null;
        }

        lfTincanManifestActivityCacheModel.name = getName();

        String name = lfTincanManifestActivityCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            lfTincanManifestActivityCacheModel.name = null;
        }

        lfTincanManifestActivityCacheModel.description = getDescription();

        String description = lfTincanManifestActivityCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            lfTincanManifestActivityCacheModel.description = null;
        }

        lfTincanManifestActivityCacheModel.launch = getLaunch();

        String launch = lfTincanManifestActivityCacheModel.launch;

        if ((launch != null) && (launch.length() == 0)) {
            lfTincanManifestActivityCacheModel.launch = null;
        }

        lfTincanManifestActivityCacheModel.resource = getResource();

        String resource = lfTincanManifestActivityCacheModel.resource;

        if ((resource != null) && (resource.length() == 0)) {
            lfTincanManifestActivityCacheModel.resource = null;
        }

        return lfTincanManifestActivityCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", tincanID=");
        sb.append(getTincanID());
        sb.append(", packageID=");
        sb.append(getPackageID());
        sb.append(", activityType=");
        sb.append(getActivityType());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", launch=");
        sb.append(getLaunch());
        sb.append(", resource=");
        sb.append(getResource());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append(
            "com.arcusys.learn.persistence.liferay.model.LFTincanManifestActivity");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tincanID</column-name><column-value><![CDATA[");
        sb.append(getTincanID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>packageID</column-name><column-value><![CDATA[");
        sb.append(getPackageID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>activityType</column-name><column-value><![CDATA[");
        sb.append(getActivityType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>launch</column-name><column-value><![CDATA[");
        sb.append(getLaunch());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>resource</column-name><column-value><![CDATA[");
        sb.append(getResource());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}