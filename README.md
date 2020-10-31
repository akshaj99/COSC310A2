# COSC310A2

The goal of this project is to create an interactive, text-based chatbot which is capable of completing 30 turns of conversation in a realistic manner.

Our project is simulating a conversation between a pair of new friends. It will focus on the topic of "hobbies". According to user's questions, the chatbot "Mike" will give multiple responses.

# How to compile and run
This was created and test on IntelliJ IDEA CE

At this stage, the conversation focuses on only 6 topics of hobbies:

-Reading

-Basketball

-Swimming

-Cooking

-Painting

-Movies


The chatbot "Mike" can have brief conversations with user around these topics.

```bash
Mike: Hello, I'm Mike and I'm a chatbot. Nice to meet you.
User: Do you like reading?
Mike: I love reading!
User: what do you know about reading?
Mike: Reading is a good way for us to gain knowledge and enrich our experience.
User: What is your habbit of reading?
Mike: I read for half an hour every day, which helps me develop good reading habits.
```

At this stage, the agent is not able to handle the conversation of other topics or meaningless sentences.

```bash
User: Do you like playing football?
Mike: Sorry, I haven't tried it before. Do you want to introduce it for me?
User: Football is a very interesting sport.
Mike: Cool! That's interesting!
User: jsiejele
Mike: I'm sorry I don't understand. Could we talk about something else?
```

listing:

1. Requirement Analyzing.

1. Design Friend "Mike".
	1. Hobbies
		1. Type of hobby
		1. Reaction to this hobby
		1. Specification, like merits or deflects
		1. Habbits
	1. Responce
		1. True or False statement
		1. Keywords analysis
		1. Call to Hobbies for matching keywords

1. Coding.
	1. List of adjectives
	1. List of hobbies
	1. List of doubts
	1. List of reasons
  
1. Testing.
	1. Reasonable user
		1. Enter the hobby
		1. Ask for benefits or introduce the hobby if the answer is no
		1. Ask habbit of the hobby
		1. Try different hobbies
	1. Trouble maker
		1. Enter gibberish in all stages
		1. Use inproper language during the communication
		
1. Deployment.

1. Maintenance.
