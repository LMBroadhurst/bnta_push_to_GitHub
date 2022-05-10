# Football Matches - Tasks

Each of the questions/tasks below can be answered using a `SELECT` query. When you find a solution copy it into the code block under the question before pushing your solution to GitHub.

1) Find all the matches from 2017.

```sql
SELECT * FROM matches WHERE season = 2021;
```

2) Find all the matches featuring Barcelona.

```sql
SELECT * FROM matches WHERE 'Barcelona' IN (hometeam, awayteam);
```

3) What are the names of the Scottish divisions included?

```sql
SELECT name FROM divisions WHERE country = 'Scotland';
```

4) Find the division code for the Bundesliga. Use that code to find out how many matches Freiburg have played in the Bundesliga since the data started being collected.

```sql
SELECT code, name FROM divisions WHERE country = 'Deutschland';

SELECT COUNT(*) FROM matches WHERE division_code = 'D1' AND (hometeam = 'Freiburg' OR awayteam = 'Freiburg');

// 374
```

5) Find the unique names of the teams which include the word "City" in their name (as entered in the database)

```sql
SELECT DISTINCT hometeam FROM matches WHERE LOWER(hometeam) LIKE LOWER('%city%');

// 4
```

6) How many different teams have played in matches recorded in a French division?

```sql
SELECT COUNT(DISTINCT hometeam) FROM matches WHERE division_code = 'F1' OR division_code = 'F2';

// 61
```

7) Have Huddersfield played Swansea in the period covered?

```sql
football=# SELECT hometeam, awayteam, season FROM matches WHERE (hometeam = 'Huddersfield' AND awayteam = 'Swansea');

// Yes
```

8) How many draws were there in the Eredivisie between 2010 and 2015?

```sql
SELECT COUNT(ftr) FROM matches WHERE (ftr = 'D') AND (season > 2009 AND season < 2016) AND division_code = 'N1';
```

9) Select the matches played in the Premier League in order of total goals scored from highest to lowest. Where there is a tie the match with more home goals should come first.

```sql
SELECT * FROM matches WHERE (division_code = 'E0') ORDER BY (fthg + ftag) DESC, fthg DESC;
```

10) In which division and which season were the most goals scored?

```sql
SELECT SUM(fthg + ftag), season, division_code FROM matches GROUP BY division_code, season ORDER BY SUM DESC LIMIT 1;
-- English National League: 1592, 2013
-- Division which scored the most goals

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'E0') GROUP BY season ORDER BY SUM;
// Premier league: 1072, 2019

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'E1') GROUP BY season ORDER BY SUM;
// EFL Championship: 1510, 2011

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'E2') GROUP BY season ORDER BY SUM;
// EFL League 1: 1516, 2009

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'E3') GROUP BY season ORDER BY SUM;
// EFL league 2: 1506, 2011

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'F1') GROUP BY season ORDER BY SUM;
// Ligue 1: 1049, 2021

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'F2') GROUP BY season ORDER BY SUM;
// 1035, 2018

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'B1') GROUP BY season ORDER BY SUM;
// 914, 2021

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'D1') GROUP BY season ORDER BY SUM;
// 982, 2019

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'D2') GROUP BY season ORDER BY SUM;
// 908, 2021

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'G1') GROUP BY season ORDER BY SUM;
-- 776, 2014

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'I1') GROUP BY season ORDER BY SUM;
-- 1160, 2021

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'I2') GROUP BY season ORDER BY SUM;
-- 1189, 2008

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'N1') GROUP BY season ORDER BY SUM;
-- 1061, 2019

SELECT SUM(fthg + ftag), season FROM matches WHERE (division_code = 'P1') GROUP BY season ORDER BY SUM;
-- 831, 2016

-- Could show them all, would rather look for a cleaner way to do the calculation

```

### Useful Resources

- [Filtering results](https://www.w3schools.com/sql/sql_where.asp)
- [Ordering results](https://www.w3schools.com/sql/sql_orderby.asp)
- [Grouping results](https://www.w3schools.com/sql/sql_groupby.asp)