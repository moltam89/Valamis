package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the l f quiz quest cat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFQuizQuestCatPersistenceImpl
 * @see LFQuizQuestCatUtil
 * @generated
 */
public interface LFQuizQuestCatPersistence extends BasePersistence<LFQuizQuestCat> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LFQuizQuestCatUtil} to access the l f quiz quest cat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the l f quiz quest cats where quizId = &#63; and parentId = &#63;.
    *
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @return the matching l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> findByQuizIdAndParentId(
        java.lang.Integer quizId, java.lang.Integer parentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f quiz quest cats where quizId = &#63; and parentId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @param start the lower bound of the range of l f quiz quest cats
    * @param end the upper bound of the range of l f quiz quest cats (not inclusive)
    * @return the range of matching l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> findByQuizIdAndParentId(
        java.lang.Integer quizId, java.lang.Integer parentId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f quiz quest cats where quizId = &#63; and parentId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @param start the lower bound of the range of l f quiz quest cats
    * @param end the upper bound of the range of l f quiz quest cats (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> findByQuizIdAndParentId(
        java.lang.Integer quizId, java.lang.Integer parentId, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f quiz quest cat in the ordered set where quizId = &#63; and parentId = &#63;.
    *
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f quiz quest cat
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException if a matching l f quiz quest cat could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat findByQuizIdAndParentId_First(
        java.lang.Integer quizId, java.lang.Integer parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f quiz quest cat in the ordered set where quizId = &#63; and parentId = &#63;.
    *
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f quiz quest cat, or <code>null</code> if a matching l f quiz quest cat could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat fetchByQuizIdAndParentId_First(
        java.lang.Integer quizId, java.lang.Integer parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f quiz quest cat in the ordered set where quizId = &#63; and parentId = &#63;.
    *
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f quiz quest cat
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException if a matching l f quiz quest cat could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat findByQuizIdAndParentId_Last(
        java.lang.Integer quizId, java.lang.Integer parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f quiz quest cat in the ordered set where quizId = &#63; and parentId = &#63;.
    *
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f quiz quest cat, or <code>null</code> if a matching l f quiz quest cat could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat fetchByQuizIdAndParentId_Last(
        java.lang.Integer quizId, java.lang.Integer parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f quiz quest cats before and after the current l f quiz quest cat in the ordered set where quizId = &#63; and parentId = &#63;.
    *
    * @param id the primary key of the current l f quiz quest cat
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f quiz quest cat
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException if a l f quiz quest cat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat[] findByQuizIdAndParentId_PrevAndNext(
        long id, java.lang.Integer quizId, java.lang.Integer parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f quiz quest cats where quizId = &#63; and parentId = &#63; from the database.
    *
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByQuizIdAndParentId(java.lang.Integer quizId,
        java.lang.Integer parentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f quiz quest cats where quizId = &#63; and parentId = &#63;.
    *
    * @param quizId the quiz ID
    * @param parentId the parent ID
    * @return the number of matching l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public int countByQuizIdAndParentId(java.lang.Integer quizId,
        java.lang.Integer parentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f quiz quest cats where quizId = &#63;.
    *
    * @param quizId the quiz ID
    * @return the matching l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> findByQuizId(
        java.lang.Integer quizId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f quiz quest cats where quizId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param quizId the quiz ID
    * @param start the lower bound of the range of l f quiz quest cats
    * @param end the upper bound of the range of l f quiz quest cats (not inclusive)
    * @return the range of matching l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> findByQuizId(
        java.lang.Integer quizId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f quiz quest cats where quizId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param quizId the quiz ID
    * @param start the lower bound of the range of l f quiz quest cats
    * @param end the upper bound of the range of l f quiz quest cats (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> findByQuizId(
        java.lang.Integer quizId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f quiz quest cat in the ordered set where quizId = &#63;.
    *
    * @param quizId the quiz ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f quiz quest cat
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException if a matching l f quiz quest cat could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat findByQuizId_First(
        java.lang.Integer quizId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f quiz quest cat in the ordered set where quizId = &#63;.
    *
    * @param quizId the quiz ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f quiz quest cat, or <code>null</code> if a matching l f quiz quest cat could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat fetchByQuizId_First(
        java.lang.Integer quizId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f quiz quest cat in the ordered set where quizId = &#63;.
    *
    * @param quizId the quiz ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f quiz quest cat
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException if a matching l f quiz quest cat could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat findByQuizId_Last(
        java.lang.Integer quizId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f quiz quest cat in the ordered set where quizId = &#63;.
    *
    * @param quizId the quiz ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f quiz quest cat, or <code>null</code> if a matching l f quiz quest cat could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat fetchByQuizId_Last(
        java.lang.Integer quizId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f quiz quest cats before and after the current l f quiz quest cat in the ordered set where quizId = &#63;.
    *
    * @param id the primary key of the current l f quiz quest cat
    * @param quizId the quiz ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f quiz quest cat
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException if a l f quiz quest cat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat[] findByQuizId_PrevAndNext(
        long id, java.lang.Integer quizId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f quiz quest cats where quizId = &#63; from the database.
    *
    * @param quizId the quiz ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByQuizId(java.lang.Integer quizId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f quiz quest cats where quizId = &#63;.
    *
    * @param quizId the quiz ID
    * @return the number of matching l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public int countByQuizId(java.lang.Integer quizId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the l f quiz quest cat in the entity cache if it is enabled.
    *
    * @param lfQuizQuestCat the l f quiz quest cat
    */
    public void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat lfQuizQuestCat);

    /**
    * Caches the l f quiz quest cats in the entity cache if it is enabled.
    *
    * @param lfQuizQuestCats the l f quiz quest cats
    */
    public void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> lfQuizQuestCats);

    /**
    * Creates a new l f quiz quest cat with the primary key. Does not add the l f quiz quest cat to the database.
    *
    * @param id the primary key for the new l f quiz quest cat
    * @return the new l f quiz quest cat
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat create(
        long id);

    /**
    * Removes the l f quiz quest cat with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f quiz quest cat
    * @return the l f quiz quest cat that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException if a l f quiz quest cat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat lfQuizQuestCat)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f quiz quest cat with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException} if it could not be found.
    *
    * @param id the primary key of the l f quiz quest cat
    * @return the l f quiz quest cat
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException if a l f quiz quest cat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFQuizQuestCatException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f quiz quest cat with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f quiz quest cat
    * @return the l f quiz quest cat, or <code>null</code> if a l f quiz quest cat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f quiz quest cats.
    *
    * @return the l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f quiz quest cats.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f quiz quest cats
    * @param end the upper bound of the range of l f quiz quest cats (not inclusive)
    * @return the range of l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f quiz quest cats.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestCatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f quiz quest cats
    * @param end the upper bound of the range of l f quiz quest cats (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFQuizQuestCat> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f quiz quest cats from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f quiz quest cats.
    *
    * @return the number of l f quiz quest cats
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
