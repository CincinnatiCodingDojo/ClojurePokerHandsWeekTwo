(ns PokerHands.core
 (:use [clojure.string]))

(defn buildCard [cardName]
	(and (not (blank? cardName))
		 (= 2 (count cardName)))
)

(defn isValidRank [rank]
	(and (not (blank? rank))
		 (contains? #{"2" "3" "4" "5" "6" "7" "8" "9" "T" "J" "Q" "K" "A"} rank))
)

(defn isValidSuit [suit]
	(and (not (blank? suit))
		(contains? #{"D"} suit))
)

(defn buildCardWithRankAndSuit [rank, suit]
	nil
)