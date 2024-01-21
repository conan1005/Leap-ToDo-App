// import React, { useState, useEffect } from 'react';
// import { Link } from 'react-router-dom';
// import moment from 'moment';
// import { useHistory } from "react-router-dom";
// import EditIcon from '@mui/icons-material/Edit';
// import DeleteIcon from '@mui/icons-material/Delete';
// import styles from './Todo.module.css';
// import {Checkbox} from "@mui/material";
//
// function Todo({ todo, markCompleted, deleteTodo }) {
//     let history = useHistory();
//
//     return (
//         <div className="container">
//
//
//             <div className={styles.box}>
//                 <div className={styles.header}>
//                     <Checkbox onChange={() => markCompleted(todo.id)} checked={todo.isCompleted} className={styles.checkbox}/>
//                     <strong>{todo.title}</strong>
//                 </div>
//                 <p>{todo.description}</p>
//                 <div className={styles.info}>
//                     <strong>Due Date:</strong> {moment(todo.targetDate).format('ll')}
//                 </div>
//                 <div className={styles.actions}>
//
//                     <Link to={{pathname: `/update/${todo.id}`}}>
//                         <button className="btn btn-primary">
//                             <EditIcon/>
//                         </button>
//                     </Link>
//
//                     <button className="btn btn-danger" onClick={() => deleteTodo(todo.id)}>
//                         <DeleteIcon/>
//                     </button>
//                 </div>
//             </div>
//         </div>
//     );
// }
//
// export default Todo;
//
// Todo.js
import React from 'react';
import moment from 'moment';
import { Link } from 'react-router-dom';
import EditIcon from '@mui/icons-material/Edit';
import DeleteIcon from '@mui/icons-material/Delete';
import { Checkbox } from '@mui/material';
import styles from './Todo.module.css';

function Todo({ todo, markCompleted, deleteTodo }) {
    return (
        <div className={styles.box}>
            <div className={styles.header}>
                <div className={styles.titleContainer}>
                    <strong className={styles.title}>{todo.title}</strong>
                    <span className={styles.dueDate}>{moment(todo.targetDate).format('ll')}</span>
                </div>
                <Checkbox onChange={() => markCompleted(todo.id)} checked={todo.isCompleted} className={styles.checkbox} />
            </div>
            <p className={styles.description}>{todo.description}</p>
            <div className={styles.actions}>
                <Link to={{ pathname: `/update/${todo.id}` }}>
                    <button className="btn btn-primary">
                        <EditIcon />
                    </button>
                </Link>
                <button className="btn btn-danger" onClick={() => deleteTodo(todo.id)}>
                    <DeleteIcon />
                </button>
            </div>
        </div>
    );
}

export default Todo;
