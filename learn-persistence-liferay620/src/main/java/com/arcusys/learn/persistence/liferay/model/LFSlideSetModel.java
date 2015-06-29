package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LFSlideSet service. Represents a row in the &quot;Learn_LFSlideSet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFSlideSetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFSlideSetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFSlideSet
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFSlideSetImpl
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFSlideSetModelImpl
 * @generated
 */
public interface LFSlideSetModel extends BaseModel<LFSlideSet> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l f slide set model instance should use the {@link LFSlideSet} interface instead.
     */

    /**
     * Returns the primary key of this l f slide set.
     *
     * @return the primary key of this l f slide set
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this l f slide set.
     *
     * @param primaryKey the primary key of this l f slide set
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this l f slide set.
     *
     * @return the ID of this l f slide set
     */
    public long getId();

    /**
     * Sets the ID of this l f slide set.
     *
     * @param id the ID of this l f slide set
     */
    public void setId(long id);

    /**
     * Returns the title of this l f slide set.
     *
     * @return the title of this l f slide set
     */
    @AutoEscape
    public String getTitle();

    /**
     * Sets the title of this l f slide set.
     *
     * @param title the title of this l f slide set
     */
    public void setTitle(String title);

    /**
     * Returns the description of this l f slide set.
     *
     * @return the description of this l f slide set
     */
    @AutoEscape
    public String getDescription();

    /**
     * Sets the description of this l f slide set.
     *
     * @param description the description of this l f slide set
     */
    public void setDescription(String description);

    /**
     * Returns the logo of this l f slide set.
     *
     * @return the logo of this l f slide set
     */
    @AutoEscape
    public String getLogo();

    /**
     * Sets the logo of this l f slide set.
     *
     * @param logo the logo of this l f slide set
     */
    public void setLogo(String logo);

    /**
     * Returns the course ID of this l f slide set.
     *
     * @return the course ID of this l f slide set
     */
    public Long getCourseId();

    /**
     * Sets the course ID of this l f slide set.
     *
     * @param courseId the course ID of this l f slide set
     */
    public void setCourseId(Long courseId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(LFSlideSet lfSlideSet);

    @Override
    public int hashCode();

    @Override
    public CacheModel<LFSlideSet> toCacheModel();

    @Override
    public LFSlideSet toEscapedModel();

    @Override
    public LFSlideSet toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}