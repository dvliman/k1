(ns k1.core
  (:require [xtdb.api :as xt]))

;; TODO: learn about xtdb
(def node (xt/start-node {}))

(def manifest
  {:xt/id :manifest
   :pilot-name "Johanna"
   :id/rocket "SB002-sol"
   :id/employee "22910x2"
   :badges "SETUP"
   :cargo ["stereo" "gold fish" "slippers" "secret note"]})

(xt/submit-tx node [[::xt/put manifest]])

(xt/sync node)

(xt/entity (xt/db node) :manifest)

;; site/id
;; site/name
;; site/domain
;; site/navigation
;; site/classless-css
;; site/classless-theme
;; site/network-enabled
;; site/date-formatter-format
;; site/footer
;;
;; site/get-site-id [access-token]
;; auth/get-user-info [access-token]
;; auth/login [email] generate-session, ses-auth-login, aws-user-pool/validates, possibly callback, write cookie/access-token
;; auth/logout
;;
;; UserInfo writes post associated to site
;; post/owner-id (user-info/id)
;; post/site-id
;; post/id
;; post/title
;; post/content
;; post/created-at
;; post/updated-at
;;
;; site-homepage
;; subdomain (site/domain) -> (site/id, post/site-id) -> (site/*, post/* created-at desc)
;;
;; post-detail
;; post/slug -> post/*
;;
;; admin
;;   admin-homepage
;;     manage
;;       pages
;;       navigation
;;       posts
;;
;;     site
;;       design (classless example, link to site with examples markdown)
;;       domain
;;       network
;;       delete this space
;;
;; You are logged in. This means you will be able to see draft blog posts.
;; If you want to see the site as it appears to everyone else, you may logout.
;;
;; public
;; landing page
;;    features
;;      minimalistic design, no tracking
;;      rss
;;      free custom domain (learn more)

(defn main []
  )
