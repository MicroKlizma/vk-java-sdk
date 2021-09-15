package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * CountersGroup object
 */
public class CountersGroup implements Validable {
    /**
     * Addresses number
     */
    @SerializedName("addresses")
    private Integer addresses;

    /**
     * Photo albums number
     */
    @SerializedName("albums")
    private Integer albums;

    /**
     * Audios number
     */
    @SerializedName("audios")
    private Integer audios;

    /**
     * Audio playlists number
     */
    @SerializedName("audio_playlists")
    private Integer audioPlaylists;

    /**
     * Docs number
     */
    @SerializedName("docs")
    private Integer docs;

    /**
     * Market items number
     */
    @SerializedName("market")
    private Integer market;

    /**
     * Photos number
     */
    @SerializedName("photos")
    private Integer photos;

    /**
     * Topics number
     */
    @SerializedName("topics")
    private Integer topics;

    /**
     * Videos number
     */
    @SerializedName("videos")
    private Integer videos;

    /**
     * Market services number
     */
    @SerializedName("market_services")
    private Integer marketServices;

    /**
     * Podcasts number
     */
    @SerializedName("podcasts")
    private Integer podcasts;

    /**
     * Articles number
     */
    @SerializedName("articles")
    private Integer articles;

    /**
     * Narratives number
     */
    @SerializedName("narratives")
    private Integer narratives;

    /**
     * Clips number
     */
    @SerializedName("clips")
    private Integer clips;

    /**
     * Clips followers number
     */
    @SerializedName("clips_followers")
    private Integer clipsFollowers;

    public Integer getAddresses() {
        return addresses;
    }

    public CountersGroup setAddresses(Integer addresses) {
        this.addresses = addresses;
        return this;
    }

    public Integer getAlbums() {
        return albums;
    }

    public CountersGroup setAlbums(Integer albums) {
        this.albums = albums;
        return this;
    }

    public Integer getAudios() {
        return audios;
    }

    public CountersGroup setAudios(Integer audios) {
        this.audios = audios;
        return this;
    }

    public Integer getAudioPlaylists() {
        return audioPlaylists;
    }

    public CountersGroup setAudioPlaylists(Integer audioPlaylists) {
        this.audioPlaylists = audioPlaylists;
        return this;
    }

    public Integer getDocs() {
        return docs;
    }

    public CountersGroup setDocs(Integer docs) {
        this.docs = docs;
        return this;
    }

    public Integer getMarket() {
        return market;
    }

    public CountersGroup setMarket(Integer market) {
        this.market = market;
        return this;
    }

    public Integer getPhotos() {
        return photos;
    }

    public CountersGroup setPhotos(Integer photos) {
        this.photos = photos;
        return this;
    }

    public Integer getTopics() {
        return topics;
    }

    public CountersGroup setTopics(Integer topics) {
        this.topics = topics;
        return this;
    }

    public Integer getVideos() {
        return videos;
    }

    public CountersGroup setVideos(Integer videos) {
        this.videos = videos;
        return this;
    }

    public Integer getMarketServices() {
        return marketServices;
    }

    public CountersGroup setMarketServices(Integer marketServices) {
        this.marketServices = marketServices;
        return this;
    }

    public Integer getPodcasts() {
        return podcasts;
    }

    public CountersGroup setPodcasts(Integer podcasts) {
        this.podcasts = podcasts;
        return this;
    }

    public Integer getArticles() {
        return articles;
    }

    public CountersGroup setArticles(Integer articles) {
        this.articles = articles;
        return this;
    }

    public Integer getNarratives() {
        return narratives;
    }

    public CountersGroup setNarratives(Integer narratives) {
        this.narratives = narratives;
        return this;
    }

    public Integer getClips() {
        return clips;
    }

    public CountersGroup setClips(Integer clips) {
        this.clips = clips;
        return this;
    }

    public Integer getClipsFollowers() {
        return clipsFollowers;
    }

    public CountersGroup setClipsFollowers(Integer clipsFollowers) {
        this.clipsFollowers = clipsFollowers;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses, albums, narratives, topics, clips, marketServices, videos, photos, market, podcasts, docs, audios, audioPlaylists, articles, clipsFollowers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountersGroup countersGroup = (CountersGroup) o;
        return Objects.equals(addresses, countersGroup.addresses) &&
                Objects.equals(albums, countersGroup.albums) &&
                Objects.equals(narratives, countersGroup.narratives) &&
                Objects.equals(topics, countersGroup.topics) &&
                Objects.equals(clips, countersGroup.clips) &&
                Objects.equals(audioPlaylists, countersGroup.audioPlaylists) &&
                Objects.equals(videos, countersGroup.videos) &&
                Objects.equals(marketServices, countersGroup.marketServices) &&
                Objects.equals(photos, countersGroup.photos) &&
                Objects.equals(market, countersGroup.market) &&
                Objects.equals(podcasts, countersGroup.podcasts) &&
                Objects.equals(docs, countersGroup.docs) &&
                Objects.equals(audios, countersGroup.audios) &&
                Objects.equals(clipsFollowers, countersGroup.clipsFollowers) &&
                Objects.equals(articles, countersGroup.articles);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CountersGroup{");
        sb.append("addresses=").append(addresses);
        sb.append(", albums=").append(albums);
        sb.append(", narratives=").append(narratives);
        sb.append(", topics=").append(topics);
        sb.append(", clips=").append(clips);
        sb.append(", audioPlaylists=").append(audioPlaylists);
        sb.append(", videos=").append(videos);
        sb.append(", marketServices=").append(marketServices);
        sb.append(", photos=").append(photos);
        sb.append(", market=").append(market);
        sb.append(", podcasts=").append(podcasts);
        sb.append(", docs=").append(docs);
        sb.append(", audios=").append(audios);
        sb.append(", clipsFollowers=").append(clipsFollowers);
        sb.append(", articles=").append(articles);
        sb.append('}');
        return sb.toString();
    }
}
