package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFSlideSet;
import com.arcusys.learn.persistence.liferay.model.LFSlideSetModel;

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
 * The base model implementation for the LFSlideSet service. Represents a row in the &quot;Learn_LFSlideSet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFSlideSetModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFSlideSetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFSlideSetImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFSlideSet
 * @see com.arcusys.learn.persistence.liferay.model.LFSlideSetModel
 * @generated
 */
public class LFSlideSetModelImpl extends BaseModelImpl<LFSlideSet>
    implements LFSlideSetModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f slide set model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFSlideSet} interface instead.
     */
    public static final String TABLE_NAME = "Learn_LFSlideSet";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "title", Types.VARCHAR },
            { "description", Types.CLOB },
            { "logo", Types.VARCHAR },
            { "courseId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFSlideSet (id_ LONG not null primary key,title VARCHAR(75) null,description TEXT null,logo VARCHAR(75) null,courseId LONG null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFSlideSet";
    public static final String ORDER_BY_JPQL = " ORDER BY lfSlideSet.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Learn_LFSlideSet.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFSlideSet"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFSlideSet"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFSlideSet"),
            true);
    public static long COURSEID_COLUMN_BITMASK = 1L;
    public static long ID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFSlideSet"));
    private static ClassLoader _classLoader = LFSlideSet.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LFSlideSet.class
        };
    private long _id;
    private String _title;
    private String _description;
    private String _logo;
    private Long _courseId;
    private Long _originalCourseId;
    private boolean _setOriginalCourseId;
    private long _columnBitmask;
    private LFSlideSet _escapedModel;

    public LFSlideSetModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return LFSlideSet.class;
    }

    @Override
    public String getModelClassName() {
        return LFSlideSet.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("title", getTitle());
        attributes.put("description", getDescription());
        attributes.put("logo", getLogo());
        attributes.put("courseId", getCourseId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String logo = (String) attributes.get("logo");

        if (logo != null) {
            setLogo(logo);
        }

        Long courseId = (Long) attributes.get("courseId");

        if (courseId != null) {
            setCourseId(courseId);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public String getLogo() {
        return _logo;
    }

    @Override
    public void setLogo(String logo) {
        _logo = logo;
    }

    @Override
    public Long getCourseId() {
        return _courseId;
    }

    @Override
    public void setCourseId(Long courseId) {
        _columnBitmask |= COURSEID_COLUMN_BITMASK;

        if (!_setOriginalCourseId) {
            _setOriginalCourseId = true;

            _originalCourseId = _courseId;
        }

        _courseId = courseId;
    }

    public Long getOriginalCourseId() {
        return _originalCourseId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFSlideSet.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFSlideSet toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LFSlideSet) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LFSlideSetImpl lfSlideSetImpl = new LFSlideSetImpl();

        lfSlideSetImpl.setId(getId());
        lfSlideSetImpl.setTitle(getTitle());
        lfSlideSetImpl.setDescription(getDescription());
        lfSlideSetImpl.setLogo(getLogo());
        lfSlideSetImpl.setCourseId(getCourseId());

        lfSlideSetImpl.resetOriginalValues();

        return lfSlideSetImpl;
    }

    @Override
    public int compareTo(LFSlideSet lfSlideSet) {
        long primaryKey = lfSlideSet.getPrimaryKey();

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
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LFSlideSet)) {
            return false;
        }

        LFSlideSet lfSlideSet = (LFSlideSet) obj;

        long primaryKey = lfSlideSet.getPrimaryKey();

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
        LFSlideSetModelImpl lfSlideSetModelImpl = this;

        lfSlideSetModelImpl._originalCourseId = lfSlideSetModelImpl._courseId;

        lfSlideSetModelImpl._setOriginalCourseId = false;

        lfSlideSetModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFSlideSet> toCacheModel() {
        LFSlideSetCacheModel lfSlideSetCacheModel = new LFSlideSetCacheModel();

        lfSlideSetCacheModel.id = getId();

        lfSlideSetCacheModel.title = getTitle();

        String title = lfSlideSetCacheModel.title;

        if ((title != null) && (title.length() == 0)) {
            lfSlideSetCacheModel.title = null;
        }

        lfSlideSetCacheModel.description = getDescription();

        String description = lfSlideSetCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            lfSlideSetCacheModel.description = null;
        }

        lfSlideSetCacheModel.logo = getLogo();

        String logo = lfSlideSetCacheModel.logo;

        if ((logo != null) && (logo.length() == 0)) {
            lfSlideSetCacheModel.logo = null;
        }

        lfSlideSetCacheModel.courseId = getCourseId();

        return lfSlideSetCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", logo=");
        sb.append(getLogo());
        sb.append(", courseId=");
        sb.append(getCourseId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFSlideSet");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>logo</column-name><column-value><![CDATA[");
        sb.append(getLogo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>courseId</column-name><column-value><![CDATA[");
        sb.append(getCourseId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
