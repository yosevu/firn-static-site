(defn default
  ;; [{:keys [render partials build-url site-title site-author site-desc] :as config}]
  [{:keys [render partials build-url]}]
  (let [{:keys [head]} partials]
    [:html
     ;; (head config)
     (head build-url)
     [:body
      [:main
       [:article.content
        ;; [:div (render :toc)] ;; Optional; add a table of contents
        [:div (render :file)]]
       (when-let [backlinks (render :backlinks)] ; if backlinks exist, store them in a let bindings.
         [:aside.backlinks
          [:h4.backlinks__heading "Links to this note"]
          backlinks])]]]))
