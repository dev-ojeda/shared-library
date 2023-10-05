#!/usr/bin/bash -xe

books=$(jq "
        [.docs[] 
            | 
                {
                    title, 
                    author_name: .author_name[0], 
                    publish_year: .publish_year[0] 
                } 
            | select(.publish_year != null and .author_name != null)
        ]
            | sort_by(.publish_year) 
            | reverse
            | [limit(3;.[])]" book.json)

echo "${books}"