import React from 'react';

const Card = ({ title, description, imageUrl }) => {
    return (
        <div style={styles.card}>
            <img src={imageUrl} alt={title} style={styles.image} />
            <div style={styles.content}>
                <h2 style={styles.title}>{title}</h2>
                <p style={styles.description}>{description}</p>
            </div>
        </div>
    );
};

const styles = {
    card: {
        width: '300px',
        padding: '20px',
        border: '1px solid #ccc',
        borderRadius: '5px',
        backgroundColor: 'white',
        boxShadow: '0 2px 4px rgba(0, 0, 0, 0.1)',
    },
    image: {
        width: '100%',
        height: 'auto',
        borderRadius: '5px',
        marginBottom: '10px',
    },
    content: {
        textAlign: 'left',
    },
    title: {
        fontSize: '18px',
        fontWeight: 'bold',
        marginBottom: '10px',
    },
    description: {
        fontSize: '14px',
        color: '#555',
        lineHeight: '1.4',
    },
};

export default Card;
