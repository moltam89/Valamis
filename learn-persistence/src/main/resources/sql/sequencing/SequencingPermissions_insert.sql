INSERT INTO SequencingPermissions(sequencingID, choiceForChildren, choiceForNonDescendants, flowForChildren, forwardOnlyForChildren)
VALUES (:sequencingID, :e.choiceForChildren, :e.choiceForNonDescendants, :e.flowForChildren, :e.forwardOnlyForChildren)