(defn head
  ;; [{:keys [build-url site-title site-author site-desc]}]
  [build-url]
  [:html
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
    [:meta {:name "author" :content "Yosevu Kilonzo"}]
    [:meta {:name "description" :content "These are Yosevu's notes. They are written in Emacs Org-mode and published with Firn."}]
    [:title "Yosevu's notes"]
    [:link {:rel "stylesheet" :href (build-url "/static/css/firn_base.css")}]
    [:link {:rel "stylesheet" :href (build-url "/static/css/a11y-dark.css")}]
    [:script {:src (build-url "/static/js/highlight.pack.js")}]
    [:script "hljs.initHighlightingOnLoad()"]]])
