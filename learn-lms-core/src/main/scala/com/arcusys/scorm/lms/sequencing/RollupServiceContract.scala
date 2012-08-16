package com.arcusys.scorm.lms.sequencing

/**
 * Processes for rolling up attempts - contract
 */
trait RollupServiceContract {
  /**
   * Overall Rollup Process [RB.1.5] for an activity
   * May change the tracking information for the activity and its ancestors
   */
  def apply(activity: ActivityStateNode)
}