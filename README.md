# COSC310A2

The goal of this project is to create an interactive, text-based chatbot which is capable of completing 30 turns of conversation in a realistic manner.

Our project is simulating a conversation between a pair of new friends. It will focus on the topic of "hobbies". According to user's questions, the chatbot "Mike" will give multiple responses.

# How to compile and run
This was created and test on IntelliJ IDEA CE

At this stage, the conversation focuses on only 6 topics of hobbits:

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
#1) Requirement Analyzing.
#2) Design Friend "Mike".
  a. Hobbies
    1. Type of hobby
    2. Reaction to this hobby
    3. Specification, like merits or deflects
    4. Habbits
  b. Responce
    1. True or False statement
    2. Keywords analysis
    3. Call to Hobbies for matching keywords
#3) Coding.
  a. List of adjectives
  b. List of hobbies
  c. List of doubts
  d. List of reasons
#4) Testing.
  a. Reasonable user
    1. Enter the hobby
    2. Ask for benefits or introduce the hobby if the answer is no
    3. Ask habbit of the hobby
    4. Try different hobbies
  b. Trouble maker
    1. Enter gibberish in all stages
    2. Use inproper language during the communication
#5) Deployment.
#6) Maintenance.
