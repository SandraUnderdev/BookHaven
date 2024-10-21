package com.example.bookhaven

class BookCatalogRepository {
    private val bookList: ArrayList<Books> = arrayListOf(
        Books(
            title = "A Court of Thorns and Roses",
            imageResId = R.drawable.court_thorns,
            author = "Sarah J. Maas",
            genre = "Romantic Fantasy",
            description = """
            A Court of Thorns and Roses follows the story of Feyre Archeron, a 19-year-old huntress who struggles to provide for her impoverished family. One day, while hunting in the woods, she kills a wolf, only to discover that it is actually a faerie in disguise. As punishment for her actions, a beast-like creature named Tamlin takes her to his realm, the magical land of Prythian.
            
            Initially resentful of her captivity, Feyre slowly begins to uncover the truth about Tamlin and the faerie world, discovering its beauty and danger. As she becomes entangled in a web of political intrigue and ancient curses, Feyre must confront her own feelings for Tamlin while navigating the complexities of a world filled with powerful fae and dark forces.
            
            Amidst the blossoming romance and the looming threat of an evil queen, Feyre's journey transforms her from a mere mortal into a key player in a conflict that could change the fate of both the human and faerie realms forever.
        """.trimIndent()
        ),
        Books(
            title = "Everything I Know About Love",
            imageResId = R.drawable.everything,
            author = "Dolly Alderton",
            genre = "Memoir",
            description = """ 
                 is a candid and humorous memoir by Dolly Alderton, reflecting on her experiences with love, friendship, and self-discovery as she navigates her twenties and early thirties. Through a series of insightful essays, Alderton shares her journey from teenage infatuations to the complexities of adult relationships, exploring the lessons learned along the way.

                 With wit and vulnerability, she delves into the highs and lows of love, from the excitement of new romance to the heartache of breakups. Alderton also celebrates the importance of friendship, capturing the bonds formed over shared experiences, late-night conversations, and the challenges of growing up.

                 Combining poignant storytelling with relatable anecdotes, Alderton offers readers a thoughtful exploration of what it means to love and be loved in a rapidly changing world. This memoir is not just about romantic love but also about the love found in friendships and self-acceptance, making it a heartfelt reflection that resonates with anyone who has ever sought connection and understanding.
            """.trimIndent()
        ),
        Books(
            title = "Title: Funny Story",
            imageResId = R.drawable.funny,
            author = "Emily Henry",
            genre = "Contemporary Romance",
            description = """ 
               In "Funny Story," Emily Henry delivers a delightful exploration of love, friendship, and the unpredictability of life through her signature blend of humor and heartfelt storytelling. The narrative follows a group of friends who come together for a summer of laughter and self-discovery.

                As they navigate the ups and downs of relationships, career aspirations, and the complexities of adulthood, the characters find themselves in comical and poignant situations that test their bonds. With witty dialogue and relatable moments, Henry captures the essence of navigating life’s challenges while cherishing the joy that friendship brings.

                Amidst the laughter, "Funny Story" also delves into deeper themes of vulnerability and the importance of embracing one's true self. Readers will find themselves laughing out loud while also reflecting on the significance of connections and the adventures that life presents.
                  
            """.trimIndent()
        ),
        Books(
            title = "The Heaven & Earth Grocery Store",
            imageResId = R.drawable.grocery,
            author = "James McBride",
            genre = "Historical Fiction",
            description = """ 
                In "The Heaven & Earth Grocery Store," a rich tapestry of community, culture, and resilience unfolds against the backdrop of a small grocery store in a segregated Pennsylvania town during the 1970s. The novel revolves around the lives of a diverse cast of characters who intersect at the titular store, exploring themes of identity, belonging, and the everyday struggles and triumphs of life.

                At the heart of the story is the relationship between the store’s Jewish owner, a Holocaust survivor, and the Black residents of the neighborhood, showcasing the deep bonds formed through shared experiences and mutual support. Through poignant storytelling, the novel addresses issues of race, faith, and the quest for a better life, all while celebrating the richness of human connection and the power of community.

                With a blend of humor, heart, and a keen understanding of the human experience, "The Heaven & Earth Grocery Store" invites readers to reflect on the complexities of identity and the enduring spirit of those who dare to dream amid adversity.
            """.trimIndent()
        ),
        Books(
            title = "Crying in H Mart",
            imageResId = R.drawable.crying,
            author = "Michelle Zauner",
            genre = "Memoir(with elements of Cultural Criticism)",
            description = """ 
                Crying in H Mart" is a poignant and evocative memoir that explores themes of identity, grief, and the powerful bond between mother and daughter. The author recounts her experiences growing up as a half-Korean, half-American girl, navigating the complexities of her cultural identity and her relationship with her mother, who played a central role in shaping her understanding of Korean culture through food.

                The narrative takes a deeply personal turn as the author grapples with her mother's terminal illness and the impact of loss. Through the lens of food and shared meals, particularly those enjoyed at H Mart, a popular Asian grocery store, the memoir captures the emotional resonance of cooking, memory, and the comfort that comes from family traditions. With lyrical prose and heartfelt reflections, the author explores how food connects her to her heritage and to her mother, creating a profound meditation on love, loss, and the struggle to find one’s place in the world.
            """.trimIndent()
        ),
        Books(
            title = "James",
            imageResId = R.drawable.james,
            author = "Percival Everett",
            genre = "Literary Fiction ",
            description = """ 
                "James" is a thought-provoking novel that delves into the complexities of identity, race, and the search for belonging in contemporary America. The story follows the life of James, a Black man who grapples with his unique experiences and perspectives as he navigates a world filled with societal expectations and racial dynamics.

                Through a series of poignant vignettes and rich character development, the narrative explores themes of personal and cultural identity, family ties, and the impact of history on the present. Everett masterfully weaves humor and poignancy as he examines the intersections of race and individuality, illuminating the struggles and triumphs of his characters.

                As James confronts the challenges posed by a society that often seeks to define him, the novel invites readers to reflect on broader questions of race, identity, and the human experience, making it a powerful commentary on contemporary social issues.


            """.trimIndent()
        ),
        Books(
            title = "The Midnight Library",
            imageResId = R.drawable.midnight,
            author = "Matt Haig",
            genre = "Contemporary Fiction",
            description = """ 
                "The Midnight Library" tells the enchanting story of Nora Seed, a woman who finds herself in a liminal space between life and death, where she discovers a mysterious library filled with an infinite number of books. Each book represents a different life she could have lived had she made different choices.

                As Nora explores these alternate realities, she grapples with her regrets and dreams, seeking to understand the value of her own life. Through her journey, she encounters various versions of herself, each with its own challenges and triumphs, prompting deep reflections on happiness, fulfillment, and the interconnectedness of choices.

                Haig weaves a tale that is both uplifting and thought-provoking, inviting readers to ponder the possibilities of life and the significance of the paths we choose. With themes of existentialism, mental health, and the quest for meaning, "The Midnight Library" resonates as a poignant exploration of what it means to live a meaningful life.
            """.trimIndent()
        ),
        Books(
            title = "Dog Man: The Scarlet Shedder",
            imageResId = R.drawable.dogman,
            author = "Dav Pilkey",
            genre = "Children’s Graphic Novel",
            description = """ 
                In "Dog Man: The Scarlet Shedder," the twelfth installment of the beloved Dog Man series, readers are treated to another action-packed adventure featuring the heroic canine cop. When a new villain emerges, Dog Man must rally his friends and unleash his detective skills to stop the nefarious plans of the Scarlet Shedder.

                With humor, heart, and engaging illustrations, Dav Pilkey continues to captivate young readers as Dog Man navigates challenges, faces off against villains, and learns valuable lessons about friendship and bravery. The graphic novel format makes it accessible and entertaining for readers of all ages, filled with quirky characters, witty dialogue, and thrilling escapades.

                Through the blend of comic storytelling and engaging visuals, "Dog Man: The Scarlet Shedder" reinforces themes of heroism and teamwork, making it a delightful addition to the series that encourages creativity and a love for reading.

            """.trimIndent()
        ),
        Books(
            title = "The Hundred Years' War on Palestine",
            imageResId = R.drawable.hundred,
            author = "Rashid Khalidi",
            genre = "Non-Fiction",
            description = """ 
                "The Hundred Years' War on Palestine" provides a comprehensive and critical examination of the Israeli-Palestinian conflict, tracing its historical roots and evolution from 1917 to 2017. Rashid Khalidi, a prominent historian, delves into the complexities of settler colonialism, exploring how historical events, political decisions, and international interventions have shaped the ongoing struggle for Palestinian rights and identity.

                Khalidi contextualizes the conflict within a broader framework of colonialism, offering insights into the experiences of Palestinians as they navigate displacement, resistance, and resilience. Through meticulous research and compelling narrative, the book sheds light on the impact of colonial policies and the persistent efforts of Palestinians to assert their rights and maintain their cultural heritage.

                With a focus on both historical and contemporary perspectives, "The Hundred Years' War on Palestine" challenges prevailing narratives, inviting readers to engage with the complexities of this multifaceted conflict and the enduring quest for justice and peace.
            """.trimIndent()
        ),
        Books(
            title = "A Little Life",
            imageResId = R.drawable.little,
            author = "Hanya Yanagihara",
            genre = "Literary Fiction",
            description = """ 
                "A Little Life" is a profound and emotionally intense novel that follows the lives of four college friends—Jude, Willem, Malcolm, and JB—as they navigate adulthood in New York City. The narrative primarily centers on Jude St. Francis, a brilliant but enigmatic man with a traumatic past that profoundly affects his relationships and self-perception.

                As the story unfolds, it delves into themes of friendship, love, suffering, and the complexities of human connection. The bond between the friends is tested as they confront personal struggles, ambitions, and the impact of Jude's hidden history. Through rich characterization and deeply moving storytelling, Yanagihara explores the depths of loyalty, trauma, and the search for redemption.

                With its unflinching portrayal of trauma and resilience, "A Little Life" offers a haunting meditation on the fragility of life and the enduring power of love and friendship. The novel's emotional weight and nuanced exploration of pain and healing have resonated with readers, making it a significant contemporary work.
            """.trimIndent()
        ),
        Books(
            title = "This Is How You Lose the Time War",
            imageResId = R.drawable.war,
            author = "Amal El-Mohtar, Max Gladstone",
            genre = "Science Fiction",
            description = """ 
                "This Is How You Lose the Time War" is a lyrical and innovative novella that intertwines romance and science fiction in a tale of two time-traveling agents from rival futures. Red, an agent of the Agency, and Blue, a soldier of the Garden, find themselves engaged in a fierce competition across time and space.

                As they attempt to sabotage each other’s missions, they begin to exchange letters, leading to an unexpected and profound connection. Their correspondence transforms into a passionate relationship that defies the boundaries of time and allegiance. Through beautifully crafted prose, the novella explores themes of love, identity, and the nature of conflict, questioning what it means to fight for one’s beliefs while yearning for connection.

                With its poetic language and unique narrative structure, "This Is How You Lose the Time War" invites readers to contemplate the intricacies of time, love, and the choices that shape our lives, making it a standout work in contemporary speculative fiction.
            """.trimIndent()
        ),
        Books(
            title = "The Seven Husbands of Evelyn Hugo",
            imageResId = R.drawable.husbands,
            author = "Taylor Jenkins Reid",
            genre = "Contemporary Fiction",
            description = """ 
                "The Seven Husbands of Evelyn Hugo" is a captivating and immersive novel that chronicles the glamorous yet tumultuous life of Hollywood icon Evelyn Hugo. Set against the backdrop of Old Hollywood, the story unfolds through a series of interviews as the aging star recounts her rise to fame, her seven marriages, and the intricate web of love, ambition, and betrayal that shaped her life.

                As Evelyn opens up to an aspiring journalist named Monique Grant, she reveals the truths behind her marriages and the sacrifices she made in pursuit of stardom. The novel explores themes of identity, sexuality, and the complexities of love, as Evelyn grapples with societal expectations and her own desires. Through her journey, readers gain insight into the challenges faced by women in the entertainment industry and the enduring impact of personal choices.

                With a compelling narrative and richly drawn characters, "The Seven Husbands of Evelyn Hugo" is a poignant exploration of fame, love, and the stories we tell ourselves and others, ultimately revealing the power of self-acceptance and the pursuit of authenticity.
            """.trimIndent()
        ),

        )

    fun getBooks(): List<Books> {
        return bookList
    }


}

