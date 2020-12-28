---------------WELCOME TO OUR HUMBLE ENDEAVOUR TO CREATE SOMETHING HELPFULL----------------------

The main purpose of our android app is help students of my university(IUT) find room-mates much more easily
During the initial days of university it becomes very diffcult to get acquanited with people and henceforth 
finding proper room-mates becomes even more tough. But life must go on and we are here to make your lives easy

Our project is divided into several parts


----PART-1(Login/Registration)----

we used firebase authentication api to implement a simple email and password registration activity
and consequently also developed the login activity


---PART-2(Home page)----

As we are trying to help people find room-mates our DB was segmented into male and female sections(for obvious reasons)
So when a user logs in people belonging to his/her respective genders are displayed.
Info about each user is collected from DB and placed properly onto a custom cardview designed by us.
We then display info about each user onto to the card including their picture(picture displayed using the GLIDE library). 
We then used a third party library SwipeCards(link:https://github.com/Diolor/Swipecards) to implement swiping of the cards.
If a user swipes right on another user it is stored in the DB as a yes and if user swipes left it is stored as a no.
So if both user swipe rights a match is created. After a swipe is made another card with info about another user is brought on too the screen.
This is done using a custom adapter.

---PART-3(Matches page)----

All the matches of a current user are displayed here using a recycler view with a custom adapter.
There is also an unmatch button, which when clicked unmatches both the user.

---PART-4(CHAT)-----

from the matches activity if a logged in user clicks on any matched user a new Chat Activity opens where the two users can chat.

--PART-5(Settings)---

Here the user can update his personal info and picture well.
