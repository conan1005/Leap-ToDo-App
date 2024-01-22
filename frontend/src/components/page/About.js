import React from 'react';
import styles from './Landing.module.css';

export default function About() {
	return (
		<div className="text-center container">
			<h1 className={styles.heading}>About</h1>
			<p>Welcome to the Todo App, a robust and user-friendly task management system designed to help you organize and prioritize your daily activities. This application is built using a modern tech stack, combining Spring Boot for the backend, React for the frontend, and PostgreSQL for the database. It incorporates Material UI for a sleek and intuitive design and utilizes JWT for secure user authentication.</p>
		</div>
	)
}