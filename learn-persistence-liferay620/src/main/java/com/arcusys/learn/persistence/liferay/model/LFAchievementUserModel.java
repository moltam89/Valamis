package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LFAchievementUser service. Represents a row in the &quot;Learn_LFAchievementUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFAchievementUserModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFAchievementUserImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFAchievementUser
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFAchievementUserImpl
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFAchievementUserModelImpl
 * @generated
 */
public interface LFAchievementUserModel extends BaseModel<LFAchievementUser> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l f achievement user model instance should use the {@link LFAchievementUser} interface instead.
     */

    /**
     * Returns the primary key of this l f achievement user.
     *
     * @return the primary key of this l f achievement user
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this l f achievement user.
     *
     * @param primaryKey the primary key of this l f achievement user
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this l f achievement user.
     *
     * @return the ID of this l f achievement user
     */
    public long getId();

    /**
     * Sets the ID of this l f achievement user.
     *
     * @param id the ID of this l f achievement user
     */
    public void setId(long id);

    /**
     * Returns the user ID of this l f achievement user.
     *
     * @return the user ID of this l f achievement user
     */
    public Integer getUserId();

    /**
     * Sets the user ID of this l f achievement user.
     *
     * @param userId the user ID of this l f achievement user
     */
    public void setUserId(Integer userId);

    /**
     * Returns the achievement ID of this l f achievement user.
     *
     * @return the achievement ID of this l f achievement user
     */
    public Integer getAchievementId();

    /**
     * Sets the achievement ID of this l f achievement user.
     *
     * @param achievementId the achievement ID of this l f achievement user
     */
    public void setAchievementId(Integer achievementId);

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
    public int compareTo(LFAchievementUser lfAchievementUser);

    @Override
    public int hashCode();

    @Override
    public CacheModel<LFAchievementUser> toCacheModel();

    @Override
    public LFAchievementUser toEscapedModel();

    @Override
    public LFAchievementUser toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}