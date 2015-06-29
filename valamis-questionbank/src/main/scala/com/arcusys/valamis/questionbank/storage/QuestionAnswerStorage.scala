package com.arcusys.valamis.questionbank.storage

import com.arcusys.valamis.questionbank.model.Answer

/**
 * User: dkudinov
 * Date: 15.3.2013
 */

trait QuestionAnswerStorage {
  def getByQuestion(questionID: Int): Seq[Answer]

  def deleteByQuestion(questionID: Int)

  def createForQuestion(questionID: Int, answers: Seq[Answer])

  def renew()
}
