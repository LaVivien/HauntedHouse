# Haunted House

## Your haunted house adventure!

Ever since you were a little kid, there has been this one house at the end of the street that is dark and scary. Everyone says that its haunted! Of course, you don’t believe in those things, but it has inspired you, so you’ve decided to create an interactive haunted house adventure for your friends. Here’s the layout of the house:

![Alt text](https://github.com/LaVivien/HauntedHouse/blob/master/house_layout.jpg?raw=true "Title")

The user always starts the game at the front door and must immediately decide where they want to go.  Your movement constraints are as follows:
•	From the front door, the user must choose between going into the living room, dining room or up the stairs.
•	To get from one room to the next, there must be a door. That means that to get to some rooms, the user must go through other rooms. See the above diagram for more details.
•	If the user is in a room that is attached to another room via a door (not the one they just came in—no backtracking! ), the user must be given the option between going to the other room or exploring an item in the current room.
•	If the user is in a room that has no other exit, then they must be given the option between exploring the items in the room.
•	The user will have a backpack that contains the item they’ve collected during their journey. 
o	The backpack does NOT have to be an array.
o	The backpack can be a simple string, which can contain the item that a user has.
o	Use the contains method on the string that is acting as the user’s inventory to find out what item(s) they currently contain.
	e.g. inventory.contains(“string”) will return true if the word “string” is anywhere within the string inventory.

Here are the possible outcomes for exploring items in each room: 

| Floor | Room | Item(s) | Outcome |
| --- | --- | --- | --- |
| 1 | Living Room | Chest | Ghost escapes and scares you to death |
| 1 | Dining Room | Candelabra | Light up by themselves and see a death <br> shadow |
| 1 | Kitchen | Refrigerator | Open it and find some delicious soul food |
| 1 | Kitchen | Cabinet | The dishes and glasses start flying at you <br> as soon as you open the door. You get hit <br> in the head and feel yourself start moving <br> towards a light |
| 1 | Pantry | Dusty recipe box | You open it up and a recipe for chocolate <br> devils food cake appears our of no where |
| 1 | Pantry | Broom | Flies up in the air as soon as you touch it |
| 1 | Bathroom | Mirror | See a bloody face looking back at you |
| 1 | Bathroom | Shower | Room suddenly steams up and you feel <br> fingers touching the back of your neck |
| 2 | Bathroom1 | Rocking Chair | Chair starts rocking by itself with no one <br> in it |
| 2 | Bathroom1 | Window | See a child outside on a swing who suddenly disappears |
| 2 | Bathroom2 | Doll House | The dolls start dancing on their own |
| 2 | Bathroom2 | Dresser | A ghost flies out of the dresser as <br> soon as you open it and goes right though your <br> body |
| 2 | Maset Bedroom | Jewelry Box | You find the cursed Hope Diamond and <br> feel your doom |
| 2 | Maset Bedroom | Intricate Oil <br> Lamp | Rub the lamp and a genie pops out who <br> says he’ll grant you 3 wishes |
| 2 | Maset Bedroom | Shower | Suddenly hear singing in the shower, but <br> no one is there |
| 2 | Bathroom | Mirror | See a bloody face looking back at you |
| 2 | Bathroom | Shower | Room suddenly steams up and you feel <br> fingers touching the back of your neck |

## Program Flow:
•	Ask the user to enter their name so that you can personalize their experience. You will want to use their name as they move through the house and make decisions
•	Start at the front door as described above.
•	Each time the user moves to a new room, you must then ask the user what he or she wants to do next. The options available are derived above. Note that there are sometimes more that 2 options available.
•	Should the user reach a room where there is no other exit, they must select an object to explore.
•	Once the object is explored, it must be put into the backpack. The game is over. This should be indicated clearly to the user (and have fun!).

## Input/Output Requirements:
•	As stated above, you must ask the user for his or her name.
•	Welcome the user to the game. Be sure to include their name in your welcome message.
•	Using ascii art or graphics, print out an image showing where in the house the user is starting.
•	For each step, present the users with their options and ask them what they want to do (hint: put word options in quotes to indicate what they should type in to respond to your question)
•	Once they have selected an object to explore, be sure to print out their final outcome, including telling them what item they have in their backpack.
•	At the end of the game, using ascii art or graphics, print out an image showing where in the house the user ended the game.

## Program Structure Requirements:
•	For your class structure, you must use classes, objects and methods. 
•	Do NOT just use a huge series of sequential if statements, nested if statements or switch statements for your program flow






