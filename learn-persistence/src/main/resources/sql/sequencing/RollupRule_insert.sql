INSERT INTO RollupRule(sequencingID, combination, childActivitySet, minimumCount, minimumPercent, action)
VALUES (:sequencingID, :combination.toString, :childActivitySet, :minimumCount, :minimumPercent, :e.action.toString)