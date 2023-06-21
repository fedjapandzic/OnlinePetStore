
import React from 'react';
import Card from '../cards/Card.jsx';

const CardWrapper = (props) => {
    const { data } = props;
    return (
        <div style={styles.container}>
            <div style={styles.cardWrapper}>
                {data != null && Array.isArray(data) ? (
                    data.map((item, index) => (
                        <Card
                            key={index}
                            title={item.title}
                            description={item.description}
                            imageUrl={item.imageUrl}
                        />
                    ))
                ) : (
                    <div>Data not provided!</div>
                )}
            </div>
        </div>
    );
}

const styles = {
    container: {
        display: 'flex',
        justifyContent: 'center',
        padding: '20px',
    },
    cardWrapper: {
        display: 'grid',
        gridTemplateColumns: 'repeat(auto-fit, minmax(300px, 1fr))',
        gap: '20px',
        maxWidth: '80%',
    },
};
export default CardWrapper;