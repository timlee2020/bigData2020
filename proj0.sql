create table workouts (
body_part text,
workout1 text,
workout2 text
);

select * from workouts;



insert into workouts(body_part, workout1, workout2) values
('Legs', '2 sets of sumo sqauts', '2 sets of deadlifts'),
('Arms', '2 sets of pushups', '3 sets of bicep curls'),
('Back','4 sets of Lat pulldowns', '3 sets of dumbbell rows'),
('Chest', '3 sets of benchpress', '2 sets of push ups');

select * from workouts;

drop table workouts;



