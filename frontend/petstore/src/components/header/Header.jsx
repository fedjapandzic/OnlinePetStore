import React, { useState } from 'react';
import { Button, TextField } from '@mui/material';
import { BrowserRouter as Router, Link } from 'react-router-dom';

const Header = () => {
    const [isSearchExpanded, setSearchExpanded] = useState(false);
    const [searchValue, setSearchValue] = useState('');

    const handleToggleSearch = () => {
        setSearchExpanded(!isSearchExpanded);
    };

    const handleSearchInputChange = (e) => {
        setSearchValue(e.target.value);
    };

    const handleSearchSubmit = (e) => {
        e.preventDefault();
        // Perform search logic here
        console.log('Searching for:', searchValue);
        setSearchValue('');
    };

    return (
        <header style={styles.header}>
            <div style={styles.logo}>Logo</div>
            <div style={styles.buttonContainer}>
                <Button style={styles.button}>
                    <Link style={styles.link} to="/cats">Cats</Link></Button>
                <Button style={styles.button}>
                    <Link style={styles.link} to="/dogs">Dogs</Link>
                </Button>
                <Button style={styles.button}>
                    <Link style={styles.link} to="/birds">Birds</Link>
                </Button>
                <Button style={styles.button}>
                    <Link style={styles.link} to="/food">Food</Link>
                </Button>
                <Button style={styles.button}>
                    <Link style={styles.link} to="/toys">Toys</Link>
                </Button>
                <Button style={styles.button}>
                    <Link style={styles.link} to="/other">Other</Link>
                </Button>
            </div>
            <div style={styles.searchContainer}>
                {isSearchExpanded && (
                    <form onSubmit={handleSearchSubmit}>
                        <div style={styles.searchInputContainer}>
                            <TextField
                                style={styles.searchInput}
                                type="text"
                                placeholder="Search..."
                                value={searchValue}
                                variant="standard"
                                onChange={handleSearchInputChange}
                            />
                            <Button style={styles.searchButton} type="submit">
                                Search
                            </Button>
                        </div>
                    </form>
                )}
                <Button style={styles.toggleButton} onClick={handleToggleSearch}>
                    {isSearchExpanded ? 'Close' : 'Search'}
                </Button>
            </div>
        </header>
    );
};

const styles = {
    header: {
        display: 'flex',
        justifyContent: 'space-between',
        alignItems: 'center',
        padding: '10px',
        backgroundColor: 'lightgray',
    },
    logo: {
        fontSize: '20px',
        fontWeight: 'bold',
        color: 'blue',
    },
    buttonContainer: {
        display: 'flex',
    },
    button: {
        marginLeft: '10px',
        color: 'blue',
        border: 'none',
        borderRadius: '5px',
        cursor: 'pointer',
        backgroundColor: 'transparent',
    },
    link: {
        textDecoration: 'none'
    },
    searchContainer: {
        display: 'flex',
        alignItems: 'center',
    },
    searchInputContainer: {
        display: 'flex',
        borderRadius: '5px',
        overflow: 'hidden',
    },
    searchInput: {
        padding: '5px',
        flexGrow: 1,
        border: 'none',
    },
    searchButton: {
        padding: '5px 10px',
        color: 'blue',
        border: 'none',
        borderRadius: '0 5px 5px 0',
        cursor: 'pointer',
        margin: '0 0 0 -5px'
    },
    toggleButton: {
        marginLeft: '10px',
        padding: '5px 10px',
        backgroundColor: 'transparent',
        color: 'blue',
        border: 'none',
        borderRadius: '5px',
        cursor: 'pointer',
    },
};

export default Header;
