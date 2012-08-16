package com.arcusys.learn.ioc

import org.scala_tools.subcut.inject.NewBindingModule
import com.arcusys.learn.storage.StorageFactoryContract
import com.arcusys.learn.storage.impl.orbroker.StorageFactory
import com.arcusys.scorm.lms.sequencing._

object Configuration extends NewBindingModule({
  implicit module =>
    import module._
    bind[StorageFactoryContract] toSingle StorageFactory
    bind[NavigationRequestServiceContract] toSingle new NavigationRequestService
    bind[TerminationRequestServiceContract] toSingle new TerminationRequestService
    bind[SequencingRequestServiceContract] toSingle new SequencingRequestService
    bind[DeliveryRequestServiceContract] toSingle new DeliveryRequestService
    bind[RollupServiceContract] toSingle new RollupService
    bind[EndAttemptServiceContract] toSingle new EndAttemptService
})